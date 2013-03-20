package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.Tooltip;

import com.guigarage.marvfx.property.PropertySupervisor;

public class TooltipPropertySupervisor extends PropertySupervisor<Tooltip> {

	public TooltipPropertySupervisor(ObservableValue<Tooltip> observable) {
		super(observable);
	}

}
