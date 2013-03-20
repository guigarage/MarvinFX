package com.guigarage.marvfx.property.rules.present;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.property.PropertySupervisor;
import com.guigarage.marvfx.property.rules.MarvinPropertyRule;

public abstract class AbstractPropertyPresentRule<U> implements MarvinPropertyRule<U>{
	
	public abstract boolean check(ObservableValue<U> observable);
	
	public OrRule<U> or(AbstractPropertyPresentRule<U>... otherRules) {
		List<AbstractPropertyPresentRule<U>> rules = new ArrayList<>(Arrays.asList(otherRules));
		rules.add(this);
		return new OrRule<U>(rules.toArray(new AbstractPropertyPresentRule[2]));
	}
	
	public AndRule<U> and(AbstractPropertyPresentRule<U>... otherRules) {
		List<AbstractPropertyPresentRule<U>> rules = new ArrayList<>(Arrays.asList(otherRules));
		rules.add(this);
		return new AndRule<U>(rules.toArray(new AbstractPropertyPresentRule[2]));
	}
	
	public void checkAssertion(PropertySupervisor<U> supervisor) {
		supervisor.checkAssertion(this);
	}
}
