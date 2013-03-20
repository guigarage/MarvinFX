package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.Skin;

import com.guigarage.marvfx.property.PropertySupervisor;

public class SkinPropertySupervisor extends PropertySupervisor<Skin<?>> {

	public SkinPropertySupervisor(ObservableValue<Skin<?>> observable) {
		super(observable);
	}

}
