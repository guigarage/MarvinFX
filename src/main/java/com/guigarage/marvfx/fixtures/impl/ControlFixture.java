package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.control.Control;

public class ControlFixture<T extends Control> extends RegionFixture<T> {

	public ControlFixture(T node) {
		super(node);
	}
	
	public ControlFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

}
