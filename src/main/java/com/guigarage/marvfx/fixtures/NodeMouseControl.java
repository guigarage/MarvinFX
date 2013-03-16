package com.guigarage.marvfx.fixtures;

import com.guigarage.marvfx.robot.MarvinFxRobot;
import com.guigarage.marvfx.robot.MarvinFxRobotFactory;

import javafx.scene.Node;
import javafx.scene.input.MouseButton;

public class NodeMouseControl<T extends Node> {

	private T node;
	
	private MarvinFxRobot controller;
	
	public NodeMouseControl(T node) {
		this.node = node;
		controller = MarvinFxRobotFactory.create(node.getScene());
	}
	
	public NodeMouseControl<T> click(MouseButton button) {
		controller.mouseClickOnNode(node, button);
		return this;
	}
	
	public NodeMouseControl<T> press(MouseButton button) {
		controller.mousePressOnNode(node, button);
		return this;
	}
	
	public NodeMouseControl<T> release(MouseButton button) {
		controller.mouseReleaseOnNode(node, button);
		return this;
	}
	
	public NodeMouseControl<T> click() {
		return click(MouseButton.PRIMARY);
	}
	
	public NodeMouseControl<T> click(int count) {
		for(int i = 0; i < count; i++) {
			click(MouseButton.PRIMARY);
		}
		return this;
	}
	
	public NodeMouseControl<T> doubleClick() {
		return click(2);
	}
	
	public NodeMouseControl<T> press() {
		return press(MouseButton.PRIMARY);
	}
	
	public NodeMouseControl<T> release() {
		return release(MouseButton.PRIMARY);
	}
}
