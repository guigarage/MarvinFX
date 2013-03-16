package com.guigarage.marvfx.fixtures;

import com.guigarage.marvfx.property.PropertySupervisor;
import com.guigarage.marvfx.util.MarvinFxUtilities;

import javafx.scene.Node;
import javafx.scene.Scene;

public class NodeFixture<T extends Node> {

	private T node;
	
	private NodeMouseControl<T> mouse;
	
	@SuppressWarnings("unchecked")
	public NodeFixture(Scene scene, String nodeId) {
		this((T) MarvinFxUtilities.findNodeById(scene, nodeId));
	}
	
	public NodeFixture(T node) {
		this.node = node;
	}
	
	public PropertySupervisor<String> createPropertyMeterForId() {
		return new PropertySupervisor<>(node.idProperty());
	}
	
	public synchronized NodeMouseControl<T> mouse() {
		if(mouse == null) {
			mouse = new NodeMouseControl<T>(node);
		}
		return mouse;
	}
	
	public T getNode() {
		return node;
	}
}
