package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.scene.image.Image;

import com.guigarage.marvfx.property.PropertySupervisor;

public class ImagePropertySupervisor extends PropertySupervisor<Image> {

	public ImagePropertySupervisor(ObservableValue<Image> observable) {
		super(observable);
	}

}
