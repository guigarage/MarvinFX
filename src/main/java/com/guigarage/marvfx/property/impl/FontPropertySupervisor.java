package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.scene.text.Font;

import com.guigarage.marvfx.property.PropertySupervisor;

public class FontPropertySupervisor extends PropertySupervisor<Font> {

	public FontPropertySupervisor(ObservableValue<Font> observable) {
		super(observable);
	}

}
