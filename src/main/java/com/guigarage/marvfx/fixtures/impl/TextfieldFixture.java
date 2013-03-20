package com.guigarage.marvfx.fixtures.impl;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import com.guigarage.marvfx.property.impl.EventHandlerPropertySupervisor;
import com.guigarage.marvfx.property.impl.NumberPropertySupervisor;
import com.guigarage.marvfx.property.impl.PosPropertySupervisor;

public class TextfieldFixture<T extends TextField> extends TextInputControlFixture<T> {

	public TextfieldFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public TextfieldFixture(T node) {
		super(node);
	}
	
	public PosPropertySupervisor createAlignmentPropertySupervisor() {
		return new PosPropertySupervisor(getNode().alignmentProperty());
	}
	
	public EventHandlerPropertySupervisor<ActionEvent> createOnActionPropertySupervisor() {
		return new EventHandlerPropertySupervisor<>(getNode().onActionProperty());
	}
	
	public NumberPropertySupervisor createPrefColumnCountPropertySupervisor() {
		return new NumberPropertySupervisor(getNode().prefColumnCountProperty());
	}
}
