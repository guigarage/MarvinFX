package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.layout.Region;

public class RegionFixture<T extends Region> extends ParentFixture<T> {

	public RegionFixture(T node) {
		super(node);
	}

	public RegionFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}
}
