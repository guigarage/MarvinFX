package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;

import com.guigarage.marvfx.property.PropertySupervisor;

public class PosPropertySupervisor extends PropertySupervisor<Pos> {

	public PosPropertySupervisor(ObservableValue<Pos> observable) {
		super(observable);
	}

}
