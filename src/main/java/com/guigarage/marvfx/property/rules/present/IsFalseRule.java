package com.guigarage.marvfx.property.rules.present;

import javafx.beans.value.ObservableValue;

public class IsFalseRule extends AbstractPropertyPresentRule<Boolean> {

	@Override
	public boolean check(ObservableValue<Boolean> observable) {
		if(observable == null) {
			return false;
		}
		if(observable.getValue() == null) {
			return false;
		}
		return !observable.getValue().booleanValue();
	}

}