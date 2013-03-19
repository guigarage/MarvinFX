package com.guigarage.marvfx.fixtures.impl;

import java.util.concurrent.Callable;

import javafx.scene.Scene;
import javafx.scene.control.TextInputControl;

import com.guigarage.marvfx.property.PropertySupervisor;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class TextInputControlFixture<T extends TextInputControl> extends ControlFixture<T> {

	public TextInputControlFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public TextInputControlFixture(T node) {
		super(node);
	}
	
	public PropertySupervisor<String> createTextPropertySupervisor() {
		return new PropertySupervisor<>(getNode().textProperty());
	}
	
	public void setText(final String text) {
		try {
			MarvinFxUtilities.runCallableInPlatformThread(new Callable<Void>() {

				@Override
				public Void call() throws Exception {
					getNode().setText(text);
					return null;
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
