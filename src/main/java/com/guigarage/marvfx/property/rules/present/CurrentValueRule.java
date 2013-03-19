package com.guigarage.marvfx.property.rules.present;

import javafx.beans.value.ObservableValue;

public class CurrentValueRule<U> extends AbstractPropertyPresentRule<U> {

	private U assertedValue;
	
	public CurrentValueRule(U assertedValue) {
		this.assertedValue = assertedValue;
	}
	
	@Override
	public boolean check(ObservableValue<U> observable) {
		if (observable == null && assertedValue != null) {
			return false;
		}
		if (observable != null && assertedValue == null) {
			return false;
		}
		if (observable.getValue().equals(assertedValue)) {
			return true;
		}
		return false;
	}

}
