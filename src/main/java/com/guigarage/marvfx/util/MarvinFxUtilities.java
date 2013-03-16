package com.guigarage.marvfx.util;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Window;

public class MarvinFxUtilities {

	public static Rectangle2D getPrimaryScreenBounds() {
		return Screen.getPrimary().getBounds();
	}
	
	public static Rectangle2D getBoundsOnScreen(Window window) {
		return new Rectangle2D(window.getX(), window.getY(), window.getWidth(), window.getHeight());
	}
	
	public static Rectangle2D getBoundsInWindow(Scene scene) {
		return new Rectangle2D(scene.getX(), scene.getY(), scene.getWidth(), scene.getHeight());
	}
	
	public static Rectangle2D getBoundsOnScreen(Scene scene) {
		return new Rectangle2D(scene.getWindow().getX() + scene.getX(), scene.getWindow().getY() + scene.getY(), scene.getWidth(), scene.getHeight());
	}
	
	public static Point2D getPointOnScreen(Node node, Point2D pointInNode) {
		return node.localToScreen(pointInNode);
	}
	
	public static Point2D getCenterOnParent(Node node) {
		return node.localToParent(getNodeHorizontalCenter(node), getNodeVerticalCenter(node));
	}
	
	public static Point2D getCenterOnScene(Node node) {
		return node.localToScene(getNodeHorizontalCenter(node), getNodeVerticalCenter(node));
	}
	
	public static Point2D getCenterOnScreen(Node node) {
		return node.localToScreen(getNodeHorizontalCenter(node), getNodeVerticalCenter(node));
	}
	
	private static double getNodeHorizontalCenter(Node node) {
		return node.getBoundsInLocal().getMinX() + node.getBoundsInLocal().getWidth() / 2;
	}
	
	private static double getNodeVerticalCenter(Node node) {
		return node.getBoundsInLocal().getMinY() + node.getBoundsInLocal().getHeight() / 2;
	}
	
	public static Node findNodeById(Scene scene, String id) {
		Parent root = scene.getRoot();
		String rootId = root.getId();
		if(rootId != null && rootId.equals(id)) {
			return root;
		}
		return findChildNodeById(root, id);
	}
	
	public static Node findChildNodeById(Parent parent, String id) {
		for(Node child : parent.getChildrenUnmodifiable()) {
			String childId = child.getId();
			if(childId != null && childId.equals(id)) {
				return child;
			}
			if(child instanceof Parent) {
				Node foundInChild = findChildNodeById((Parent) child, id);
				if(foundInChild != null) {
					return foundInChild;
				}
			}
		}
		return null;
	}
}
