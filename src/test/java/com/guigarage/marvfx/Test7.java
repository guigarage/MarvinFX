package com.guigarage.marvfx;

import org.junit.Test;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test7 extends MarvinFxTest {

//	@Override
//	protected Scene getScene() {
//		final Button b1 = new Button("Hello MarvFX");
//		BorderPane pane = new BorderPane();
//		pane.setCenter(b1);
//		final Scene myScene = new Scene(pane);
//		return myScene;
//	}

	@Test
	public void test1() {
		System.out.println("Test");
		
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				final Button b1 = new Button("Hello MarvFX");
				BorderPane pane = new BorderPane();
				pane.setCenter(b1);
				final Scene myScene = new Scene(pane, 800, 600);
				
				Stage myStage = new Stage();
				myStage.setScene(myScene);
				myStage.sizeToScene();
				myStage.show();
			}
		});
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		
	}
}
