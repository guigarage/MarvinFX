package com.guigarage.marvfx.property.rules.present;

import javafx.beans.value.ObservableValue;

public class StringStartsWithRule extends AbstractPropertyPresentRule<String> {

	private String prefix;
	
	public StringStartsWithRule(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public boolean check(ObservableValue<String> observable) {
		if(observable.getValue() == null) {
			return false;
		}
		if (observable.getValue().startsWith(prefix)) {
			return true;
		}
		return false;
	}
}