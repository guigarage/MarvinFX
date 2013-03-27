package com.guigarage.marvfx.runtime;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.Callable;

import javafx.fxml.FXMLLoader;
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

	public static synchronized Stage show(final URL fxmlFile) {
        return showAndCreateController(fxmlFile).getStage();
    }
	
	public static synchronized MarvinFXMLWrapper showAndCreateController(final URL fxmlFile) {
        createToolkitAndPlatform();
        try {
            return MarvinFxUtilities.runCallableInPlatformThread((new Callable<MarvinFXMLWrapper>() {

                @Override
                public MarvinFXMLWrapper call() throws Exception {
                    return showInPlatformThread(fxmlFile);
                }
            }));
        } catch (Exception e) {
            throw new RuntimeException("Can't create stage", e);
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
	
	private static MarvinFXMLWrapper showInPlatformThread(URL fxmlFile) throws IOException {
	   FXMLLoader loader = new FXMLLoader(fxmlFile);
	   loader.load();
	   Node node = loader.getRoot();
	   return new MarvinFXMLWrapper(showInPlatformThread(node), loader.getController());
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
