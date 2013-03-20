package com.guigarage.marvfx.property.rules.present;

import javafx.beans.value.ObservableValue;

public class IsLessThanRule extends AbstractPropertyPresentRule<Number> {

	private double value;
	
	public IsLessThanRule(double value) {
		this.value = value;
	}
	
	@Override
	public boolean check(ObservableValue<Number> observable) {
		if(observable == null) {
			return false;
		}
		if(observable.getValue() == null) {
			return false;
		}
		return (observable.getValue().doubleValue() < value);
	}

}