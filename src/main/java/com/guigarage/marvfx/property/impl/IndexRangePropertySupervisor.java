package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.IndexRange;

import com.guigarage.marvfx.property.PropertySupervisor;

public class IndexRangePropertySupervisor extends PropertySupervisor<IndexRange> {

	public IndexRangePropertySupervisor(ObservableValue<IndexRange> observable) {
		super(observable);
	}

}
