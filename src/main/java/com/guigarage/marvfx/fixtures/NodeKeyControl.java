package com.guigarage.marvfx.fixtures;

import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

import com.guigarage.marvfx.robot.MarvinFxRobot;
import com.guigarage.marvfx.robot.MarvinFxRobotFactory;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class NodeKeyControl<T extends Node> {
	
	private T node;
	
	private MarvinFxRobot controller;
	
	public NodeKeyControl(T node) {
		this.node = node;
		controller = MarvinFxRobotFactory.create(node.getScene());
	}

	public void type(String text) {
		// TODO: noch nicht fertig MaÃŸ muss noch vernÃ¼nftig gemacht werden. (!
		// und PAGE_UP)
		controller.mouseClickOnNode(node, MouseButton.PRIMARY);
		System.out.println(MarvinFxUtilities.getCenterOnScene(node));
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (Character.isLetter(c) && Character.isUpperCase(c)) {
				controller.keyPress(KeyCode.SHIFT);
			}

			String tmpString = String.valueOf(c);
			CharToKeyCodeHandler handler = CharToKeyCodeHandler.getInstance();
			KeyCode codeToInsert = handler.getKeyCode(c);
			controller.keyType(codeToInsert, tmpString);

			if (Character.isLetter(c) && Character.isUpperCase(c)) {
				controller.keyRelease(KeyCode.SHIFT);
			}
		}

	}

	public void pressedByTime(String text, int duration) {

	}
}
