package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.property.PropertySupervisor;

public class BooleanPropertySupervisor extends PropertySupervisor<Boolean> {

	public BooleanPropertySupervisor(ObservableValue<Boolean> observable) {
		super(observable);
	}

}
