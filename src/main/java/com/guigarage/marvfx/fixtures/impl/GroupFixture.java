package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Group;
import javafx.scene.Scene;

import com.guigarage.marvfx.property.impl.BooleanPropertySupervisor;

public class GroupFixture<T extends Group> extends ParentFixture<T> {

	public GroupFixture(T node) {
		super(node);
	}

	public GroupFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public BooleanPropertySupervisor createSupervisorForAutoSizeChildren() {
		return new BooleanPropertySupervisor(getNode().autoSizeChildrenProperty());
	}
}
