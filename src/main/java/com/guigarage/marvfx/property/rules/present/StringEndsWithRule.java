package com.guigarage.marvfx.property.rules.present;

import javafx.beans.value.ObservableValue;

public class StringEndsWithRule extends AbstractPropertyPresentRule<String> {

	private String suffix;
	
	public StringEndsWithRule(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public boolean check(ObservableValue<String> observable) {
		if(observable == null) {
			return false;
		}
		if(observable.getValue() == null) {
			return false;
		}
		if (observable.getValue().endsWith(suffix)) {
			return true;
		}
		return false;
	}

	
}
