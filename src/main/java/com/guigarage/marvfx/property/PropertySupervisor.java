package com.guigarage.marvfx.property;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.MarvinFx;
import com.guigarage.marvfx.property.rules.WillChangeByDefinedCountRule;
import com.guigarage.marvfx.property.rules.WillChangeRule;
import com.guigarage.marvfx.property.rules.WillChangeThisWayRule;
import com.guigarage.marvfx.property.rules.WillNeverChangeRule;

public class PropertySupervisor<U> implements ChangeListener<U>{

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
	
	public void assertCurrentValue(U value) {
		if(!observable.getValue().equals(value)) {
			MarvinFx.getInstance().getFail().fail();
		}
	}
	
	public void assertValueIsNull() {
		if(observable.getValue() != null) {
			MarvinFx.getInstance().getFail().fail();
		}
	}
	
	public void assertValueIsNotNull() {
		if(observable.getValue() == null) {
			MarvinFx.getInstance().getFail().fail();
		}
	}
	
	@Override
	public void changed(ObservableValue<? extends U> observable, U oldValue,
			U newValue) {
		for(AbstractPropertyRule<U> rule : rules) {
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
		for(AbstractPropertyRule<U> rule : rules) {
			Iterator<RuleFail> iterator = rule.check().iterator();
			if(iterator.hasNext()) {
				MarvinFx.getInstance().getFail().fail("Rule has failed: " + iterator.next().getMessage());
			}
		}
	}
}
