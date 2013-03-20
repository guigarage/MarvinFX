package com.guigarage.marvfx.property.rules.present;

import javafx.beans.value.ObservableValue;

public class StringLengthIsEqualsRule extends AbstractPropertyPresentRule<String> {

	private int size;
	
	public StringLengthIsEqualsRule(int size) {
		this.size = size;
	}

	@Override
	public boolean check(ObservableValue<String> observable) {
		if(observable == null) {
			return false;
		}
		if(observable.getValue() == null) {
			return false;
		}
		if (observable.getValue().length() == size) {
			return true;
		}
		return false;
	}
}
