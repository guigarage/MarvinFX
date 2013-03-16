package com.guigarage.marvfx.robot;

import com.guigarage.marvfx.util.MarvinFxUtilities;

import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

public abstract class MarvinFxRobot {

	private Scene scene;
	
	public MarvinFxRobot(Scene scene) {
		this.scene = scene;
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public abstract void keyPress(KeyCode code);

	public abstract void keyRelease(KeyCode code);

	public abstract void keyType(KeyCode code, String keyChar);

	public abstract void mouseMove(int x, int y);

	public abstract void mousePress(MouseButton button);
    
	public abstract void mouseRelease(MouseButton button);
    
	public abstract void mouseClick(MouseButton button);

	public abstract void mouseWheel(int wheelAmt);

	public void mouseMove(Point2D point) {
		mouseMove((int)point.getX(), (int)point.getY());
	}
	
	public void centerMouseOnNode(Node node) {
		if(node.getScene() == null) {
			throw new RuntimeException("Node is not child of a Scene");
		}
		if(!node.getScene().equals(getScene())) {
			throw new RuntimeException("Node is not child of current Scene");
		}
		mouseMove(MarvinFxUtilities.getCenterOnScene(node));
	}

	public void mousePressOnNode(Node node, MouseButton button) {
		centerMouseOnNode(node);
		mousePress(button);
	}
    
	public void mouseReleaseOnNode(Node node, MouseButton button) {
		centerMouseOnNode(node);
		mouseRelease(button);
	}
    
	public void mouseClickOnNode(Node node, MouseButton button) {
		centerMouseOnNode(node);
		mouseClick(button);
	}
}
