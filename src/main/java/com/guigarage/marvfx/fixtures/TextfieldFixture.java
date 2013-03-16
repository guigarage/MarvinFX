package com.guigarage.marvfx.fixtures;

import com.guigarage.marvfx.property.PropertySupervisor;

import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class TextfieldFixture extends NodeFixture<TextField> {

	public TextfieldFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public TextfieldFixture(TextField node) {
		super(node);
	}
	
	public PropertySupervisor<String> createTextPropertySupervisor() {
		return new PropertySupervisor<>(getNode().textProperty());
	}
}
