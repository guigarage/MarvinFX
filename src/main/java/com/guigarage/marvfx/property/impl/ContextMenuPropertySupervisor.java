package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.ContextMenu;

import com.guigarage.marvfx.property.PropertySupervisor;

public class ContextMenuPropertySupervisor extends PropertySupervisor<ContextMenu> {

	public ContextMenuPropertySupervisor(ObservableValue<ContextMenu> observable) {
		super(observable);
	}

}
