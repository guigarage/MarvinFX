package com.guigarage.marvfx.fixtures;

import java.util.concurrent.Callable;

import com.guigarage.marvfx.property.PropertySupervisor;
import com.guigarage.marvfx.util.MarvinFxUtilities;

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
