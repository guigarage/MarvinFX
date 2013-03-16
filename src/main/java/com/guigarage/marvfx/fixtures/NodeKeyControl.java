package com.guigarage.marvfx.fixtures;

import javafx.scene.Node;

import com.guigarage.marvfx.robot.MarvinFxRobot;
import com.guigarage.marvfx.robot.MarvinFxRobotFactory;

public class NodeKeyControl<T extends Node> {
	
	private T node;
	
	private MarvinFxRobot controller;
	
	public NodeKeyControl(T node) {
		this.node = node;
		controller = MarvinFxRobotFactory.create(node.getScene());
	}
	
	public void type(String text) {
		//TODO...
	}
}
