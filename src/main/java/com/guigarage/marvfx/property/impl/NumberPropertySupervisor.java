package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.property.PropertySupervisor;

public class NumberPropertySupervisor extends PropertySupervisor<Number> {

	public NumberPropertySupervisor(ObservableValue<Number> observable) {
		super(observable);
	}

}
