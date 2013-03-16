package com.guigarage.marvfx.robot.impl;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

import com.guigarage.marvfx.robot.MarvinFxRobot;
import com.sun.javafx.robot.FXRobot;
import com.sun.javafx.robot.FXRobotFactory;

public class FxBasedRobot extends MarvinFxRobot {
	
	private FXRobot robot;
	
	public FxBasedRobot(Scene scene) {
		super(scene);
		robot = FXRobotFactory.createRobot(scene);
		robot.setAutoWaitForIdle(true);
	}

	public void keyPress(KeyCode code) {
		robot.keyPress(code);
	}

	public void keyRelease(KeyCode code) {
		robot.keyRelease(code);
	}

	public void keyType(KeyCode code, String keyChar) {
		robot.keyType(code, keyChar);
	}

	public void mouseMove(int x, int y) {
		robot.mouseMove(x, y);
	}

	public void mousePress(MouseButton button) {
		robot.mousePress(button);
	}

	public void mouseRelease(MouseButton button) {
		robot.mouseRelease(button);
	}

	public void mouseClick(MouseButton button) {
		robot.mouseClick(button);
	}

	public void mouseWheel(int wheelAmt) {
		robot.mouseWheel(wheelAmt);
	}
}
