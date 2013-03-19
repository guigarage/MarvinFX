package com.guigarage.marvfx.property.rules.present;

import javafx.beans.value.ObservableValue;

public class ValueIsNotNullRule<U> extends AbstractPropertyPresentRule<U> {

	@Override
	public boolean check(ObservableValue<U> observable) {
		if(observable == null) {
			return false;
		}
		if(observable.getValue() != null) {
			return true;
		}
		return false;
	}

}
