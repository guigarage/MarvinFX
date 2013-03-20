package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class TextfieldFixture<T extends TextField> extends TextInputControlFixture<T> {

	public TextfieldFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public TextfieldFixture(T node) {
		super(node);
	}
	
	
}
