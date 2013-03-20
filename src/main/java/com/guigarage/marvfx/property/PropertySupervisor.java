package com.guigarage.marvfx.property;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.MarvinFx;
import com.guigarage.marvfx.property.rules.RuleFail;
import com.guigarage.marvfx.property.rules.future.AbstractPropertyFutureRule;
import com.guigarage.marvfx.property.rules.future.FutureRuleObserver;
import com.guigarage.marvfx.property.rules.future.WillChangeByDefinedCountRule;
import com.guigarage.marvfx.property.rules.future.WillChangeRule;
import com.guigarage.marvfx.property.rules.future.WillChangeThisWayRule;
import com.guigarage.marvfx.property.rules.future.WillNeverChangeRule;
import com.guigarage.marvfx.property.rules.present.AbstractPropertyPresentRule;
import com.guigarage.marvfx.property.rules.present.AndRule;
import com.guigarage.marvfx.property.rules.present.OrRule;
import com.guigarage.marvfx.property.rules.present.ValueIsNotNullRule;
import com.guigarage.marvfx.property.rules.present.ValueIsNullRule;
import com.guigarage.marvfx.property.rules.present.isEqualsRule;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class PropertySupervisor<U> implements ChangeListener<U> {

	private ObservableValue<U> observable;

	private List<AbstractPropertyFutureRule<U>> rules;

	public PropertySupervisor(ObservableValue<U> observable) {
		this.observable = observable;
		reset();
		this.observable.addListener(this);
	}

	public void reset() {
		rules = new ArrayList<>();
	}

	public FutureRuleObserver<U> addFutureRule(AbstractPropertyFutureRule<U> rule) {
		FutureRuleObserver<U> observer = rule.createObserver();
		rules.add(rule);
		return observer;
	}

	public FutureRuleObserver<U> assertWillChange() {
		return addFutureRule(new WillChangeRule<U>());
	}

	public FutureRuleObserver<U> assertWillNeverChange() {
		return addFutureRule(new WillNeverChangeRule<U>());
	}

	public FutureRuleObserver<U> assertWillChangeByDefinedCount(int count) {
		return addFutureRule(new WillChangeByDefinedCountRule<U>(count));
	}

	@SuppressWarnings("unchecked")
	public FutureRuleObserver<U> assertWillChangeThisWay(U... assertedValues) {
		return addFutureRule(new WillChangeThisWayRule<U>(assertedValues));
	}

	public void assertValueIsEquals(final U value) {
		checkAssertion(new isEqualsRule<U>(value));
	}

	public void assertValueIsNull() {
		checkAssertion(new ValueIsNullRule<U>());
	}

	public void assertValueIsNotNull() {
		checkAssertion(new ValueIsNotNullRule<U>());
	}

	@Override
	public void changed(ObservableValue<? extends U> observable, U oldValue,
			U newValue) {
		for (AbstractPropertyFutureRule<U> rule : rules) {
			rule.changed(observable, oldValue, newValue);
		}
	}

	protected ObservableValue<U> getObservable() {
		return observable;
	}

	@Override
	protected void finalize() throws Throwable {
		observable.removeListener(this);
		super.finalize();
	}

	public void confirm() {
		Callable<RuleFail> checkCallable = new Callable<RuleFail>() {

			@Override
			public RuleFail call() throws Exception {
				for (AbstractPropertyFutureRule<U> rule : rules) {
					Iterator<RuleFail> iterator = rule.check().iterator();
					if (iterator.hasNext()) {
						return iterator.next();
					}
				}
				return null;
			}
		};
		try {
			RuleFail fail = MarvinFxUtilities.runCallableInPlatformThread(checkCallable);
			if (fail != null) {
				MarvinFx.getInstance().getFail()
						.fail("Rule has failed: " + fail.getMessage());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			reset();
		}
	}
	
	public void assertAny(AbstractPropertyPresentRule<U>... rules) {
		checkAssertion(new OrRule(rules));
	}
	
	public void assertAll(AbstractPropertyPresentRule<U>... rules) {
		checkAssertion(new AndRule(rules));
	}
	
	public void checkAssertion(final AbstractPropertyPresentRule<U> rule) {
		Callable<Boolean> checkCallable = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				return new Boolean(rule.check(getObservable()));
			}
		};
		try {
			if (!MarvinFxUtilities.runCallableInPlatformThread(checkCallable)) {
				MarvinFx.getInstance().getFail().fail();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
