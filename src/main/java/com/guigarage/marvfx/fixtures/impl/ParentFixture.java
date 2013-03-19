package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Parent;
import javafx.scene.Scene;

import com.guigarage.marvfx.fixtures.NodeFixture;

public class ParentFixture<T extends Parent> extends NodeFixture<T> {

	public ParentFixture(T node) {
		super(node);
	}
	
	public ParentFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

}
