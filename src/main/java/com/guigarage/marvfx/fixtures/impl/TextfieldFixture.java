package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class TextfieldFixture extends TextInputControlFixture<TextField> {

	public TextfieldFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public TextfieldFixture(TextField node) {
		super(node);
	}
	
	
}
