package com.guigarage.marvfx.robot.impl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

import com.guigarage.marvfx.robot.MarvinFxRobot;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class AwtBasedRobot extends MarvinFxRobot {

	private Robot awtRobot;
	
	public AwtBasedRobot(Scene scene, boolean headless) {
		super(scene);
		try {
			if(!headless) {
				System.setProperty("java.awt.headless", "false");
			}
			awtRobot = new Robot();
			awtRobot.setAutoWaitForIdle(true);
		} catch (AWTException e) {
			throw new RuntimeException("AWT is not working!", e);
		}
	}
	
	public void keyPress(KeyCode code) {
		awtRobot.keyPress(code.impl_getCode());
	}

	public void keyRelease(KeyCode code) {
		awtRobot.keyRelease(code.impl_getCode());
	}

	public void keyType(KeyCode code, String keyChar) {
		awtRobot.keyPress(code.impl_getCode());
		awtRobot.keyRelease(code.impl_getCode());
	}

	public void mouseMove(int x, int y) {
		Rectangle2D boundsOnScreen = MarvinFxUtilities.getBoundsOnScreen(getScene());
		awtRobot.mouseMove((int) boundsOnScreen.getMinX() + x, (int) boundsOnScreen.getMinY() + y);
	}

	private int convertToAwtButtonDownMask(MouseButton button) {
		if(button.equals(MouseButton.PRIMARY)) {
			return InputEvent.BUTTON1_DOWN_MASK;
		} else if(button.equals(MouseButton.MIDDLE)) {
			return InputEvent.BUTTON3_DOWN_MASK;
		} else {
			return InputEvent.BUTTON3_DOWN_MASK;
		} 
	}
	
	private int convertToAwtButtonMask(MouseButton button) {
		if(button.equals(MouseButton.PRIMARY)) {
			return InputEvent.BUTTON1_MASK;
		} else if(button.equals(MouseButton.MIDDLE)) {
			return InputEvent.BUTTON3_MASK;
		} else {
			return InputEvent.BUTTON3_MASK;
		} 
	}
	
	public void mousePress(MouseButton button) {
		awtRobot.mousePress(convertToAwtButtonDownMask(button));
	}

	public void mouseRelease(MouseButton button) {
		awtRobot.mouseRelease(convertToAwtButtonMask(button));
	}

	public void mouseClick(MouseButton button) {
		awtRobot.mousePress(convertToAwtButtonDownMask(button));
		awtRobot.mouseRelease(convertToAwtButtonMask(button));
	}

	public void mouseWheel(int wheelAmt) {
		awtRobot.mouseWheel(wheelAmt);
	}
}