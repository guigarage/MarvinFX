package com.guigarage.marvfx.fixtures;

import java.util.concurrent.Callable;

import javafx.scene.Node;
import javafx.scene.Scene;

import com.guigarage.marvfx.property.PropertySupervisor;
import com.guigarage.marvfx.property.impl.StringPropertySupervisor;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class NodeFixture<T extends Node> {

	private T node;

	private NodeMouseControl<T> mouse;

	private NodeKeyControl<T> keyboard;

	@SuppressWarnings("unchecked")
	public NodeFixture(Scene scene, String nodeId) {
		this((T) MarvinFxUtilities.findNodeById(scene, nodeId));
	}

	public NodeFixture(T node) {
		this.node = node;
	}

	public StringPropertySupervisor createSupervisorForId() {
		return new StringPropertySupervisor(node.idProperty());
	}

	public synchronized NodeMouseControl<T> mouse() {
		if (mouse == null) {
			mouse = new NodeMouseControl<T>(node);
		}
		return mouse;
	}

	public synchronized NodeKeyControl<T> getKeyboard() {
		if (keyboard == null) {
			keyboard = new NodeKeyControl<T>(node);
		}
		return keyboard;
	}

	public synchronized void requestFocus() {
		try {
			MarvinFxUtilities.runCallableInPlatformThread(new Callable<Void>() {

				@Override
				public Void call() throws Exception {
					node.requestFocus();
					return null;
				}
			});
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public T getNode() {
		return node;
	}
}
