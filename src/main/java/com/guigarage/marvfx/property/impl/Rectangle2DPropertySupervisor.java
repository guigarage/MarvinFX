package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.geometry.Rectangle2D;

import com.guigarage.marvfx.property.PropertySupervisor;

public class Rectangle2DPropertySupervisor extends PropertySupervisor<Rectangle2D> {

	public Rectangle2DPropertySupervisor(ObservableValue<Rectangle2D> observable) {
		super(observable);
	}

}
