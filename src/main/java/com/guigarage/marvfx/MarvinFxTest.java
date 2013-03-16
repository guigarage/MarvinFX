package com.guigarage.marvfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.junit.BeforeClass;


public class MarvinFxTest extends Application {

	@BeforeClass
	public static void before() {
		Application.launch(MarvinFxTest.class, null);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		Label label = new Label("MarvinFX");
		pane.setCenter(label);
		Scene myScene = new Scene(pane);
		primaryStage.setScene(myScene);
		System.out.println("A");
		primaryStage.show();
		System.out.println("B");
//		primaryStage.close();
		System.out.println("C");
	}
}
