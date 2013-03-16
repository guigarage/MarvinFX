package com.guigarage.marvfx.property;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.MarvinFx;
import com.guigarage.marvfx.property.rules.WillChangeByDefinedCountRule;
import com.guigarage.marvfx.property.rules.WillChangeRule;
import com.guigarage.marvfx.property.rules.WillChangeThisWayRule;
import com.guigarage.marvfx.property.rules.WillNeverChangeRule;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class PropertySupervisor<U> implements ChangeListener<U> {

	private ObservableValue<U> observable;

	private List<AbstractPropertyRule<U>> rules;

	public PropertySupervisor(ObservableValue<U> observable) {
		this.observable = observable;
		reset();
		this.observable.addListener(this);
	}

	public void reset() {
		rules = new ArrayList<>();
	}

	protected PropertyRuleObserver<U> addRule(AbstractPropertyRule<U> rule) {
		PropertyRuleObserver<U> observer = rule.createObserver();
		rules.add(rule);
		return observer;
	}

	public PropertyRuleObserver<U> assertWillChange() {
		return addRule(new WillChangeRule<U>());
	}

	public PropertyRuleObserver<U> assertWillNeverChange() {
		return addRule(new WillNeverChangeRule<U>());
	}

	public PropertyRuleObserver<U> assertWillChangeByDefinedCount(int count) {
		return addRule(new WillChangeByDefinedCountRule<U>(count));
	}

	public PropertyRuleObserver<U> assertWillChangeThisWay(U... assertedValues) {
		return addRule(new WillChangeThisWayRule<U>(assertedValues));
	}

	public void assertCurrentValue(final U value) {
		Callable<Boolean> checkCallable = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				if (observable == null && value != null) {
					return Boolean.FALSE;
				}
				if (observable != null && value == null) {
					return Boolean.FALSE;
				}
				if (observable.getValue().equals(value)) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
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

	public void assertValueIsNull() {
		Callable<Boolean> checkCallable = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				if (observable.getValue() == null) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
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

	public void assertValueIsNotNull() {
		Callable<Boolean> checkCallable = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				if (observable.getValue() != null) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
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

	@Override
	public void changed(ObservableValue<? extends U> observable, U oldValue,
			U newValue) {
		for (AbstractPropertyRule<U> rule : rules) {
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
				for (AbstractPropertyRule<U> rule : rules) {
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
		}
	}
	
	
}
