package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.property.PropertySupervisor;
import com.guigarage.marvfx.property.rules.present.IsFalseRule;
import com.guigarage.marvfx.property.rules.present.IsTrueRule;

public class BooleanPropertySupervisor extends PropertySupervisor<Boolean> {

	public BooleanPropertySupervisor(ObservableValue<Boolean> observable) {
		super(observable);
	}

	public void assertValueIsTrue() {
		checkAssertion(new IsTrueRule());
	}
	
	public void assertValueIsFalse() {
		checkAssertion(new IsFalseRule());
	}
}
