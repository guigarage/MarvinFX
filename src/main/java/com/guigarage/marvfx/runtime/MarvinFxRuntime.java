package com.guigarage.marvfx.runtime;

import java.util.concurrent.Callable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.layout.StackPaneBuilder;
import javafx.stage.Stage;

import com.guigarage.marvfx.util.MarvinFxUtilities;


public class MarvinFxRuntime {

	private static boolean toolkitCreated = false;

	private static Stage lastStage;
	
	public static synchronized void createToolkitAndPlatform() {
		if (!toolkitCreated) {
			MarvinFxApplication.launch();
			toolkitCreated = true;
		}
	}

	public static synchronized Stage show(final Parent parentNode) {
		createToolkitAndPlatform();
		try {
			return MarvinFxUtilities.runCallableInPlatformThread((new Callable<Stage>() {

				@Override
				public Stage call() throws Exception {
					return showInPlatformThread(parentNode);
				}
			}));
		} catch (Exception e) {
			throw new RuntimeException("Can't create stage", e);
		}
	}
	
	public static synchronized Stage show(final Node node) {
		createToolkitAndPlatform();
		try {
			return MarvinFxUtilities.runCallableInPlatformThread((new Callable<Stage>() {

				@Override
				public Stage call() throws Exception {
					return showInPlatformThread(node);
				}
			}));
		} catch (Exception e) {
			throw new RuntimeException("Can't create stage", e);
		}
	}
	
	public static synchronized Stage show(final Scene scene) {
		createToolkitAndPlatform();
		try {
			return MarvinFxUtilities.runCallableInPlatformThread((new Callable<Stage>() {

				@Override
				public Stage call() throws Exception {
					return showInPlatformThread(scene);
				}
			}));
		} catch (Exception e) {
			throw new RuntimeException("Can't create stage", e);
		}
	}

	private static Stage showInPlatformThread(Node node) {
		return showInPlatformThread(StackPaneBuilder.create().children(node).build());
	}
	
	private static Stage showInPlatformThread(Parent parentNode) {
		return showInPlatformThread(SceneBuilder.create().root(parentNode).build());
	}
	
	private static Stage showInPlatformThread(Scene scene) {
		if(lastStage != null) {
			lastStage.close();
			lastStage = null;
		}
		Stage myStage = new Stage();
		myStage.setScene(scene);
		myStage.show();
		lastStage = myStage;
		return myStage;
	}
}
