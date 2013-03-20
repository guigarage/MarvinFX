package com.guigarage.marvfx.property.rules.present;

import javafx.beans.value.ObservableValue;

public class StringIsEmptyRule extends AbstractPropertyPresentRule<String> {

	@Override
	public boolean check(ObservableValue<String> observable) {
		if(observable == null) {
			return false;
		}
		if(observable.getValue() == null) {
			return false;
		}
		return observable.getValue().isEmpty();
	}
}