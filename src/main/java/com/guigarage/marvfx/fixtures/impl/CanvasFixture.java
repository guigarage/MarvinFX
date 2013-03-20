package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

import com.guigarage.marvfx.fixtures.NodeFixture;
import com.guigarage.marvfx.property.impl.NumberPropertySupervisor;

public class CanvasFixture<T extends Canvas> extends NodeFixture<T> {

	public CanvasFixture(T node) {
		super(node);
	}

	public CanvasFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}
	
	public NumberPropertySupervisor createSupervisorForWidth() {
		return new NumberPropertySupervisor(getNode().widthProperty());
	}
	
	public NumberPropertySupervisor createSupervisorForHeight() {
		return new NumberPropertySupervisor(getNode().heightProperty());
	}
}
