package com.guigarage.marvfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import com.guigarage.marvfx.fixtures.NodeFixture;

public class Test5 extends Application {

	public void start(Stage primaryStage) throws Exception {
		final Button b1 = new Button("Hello MarvFX");
		b1.setId("b1");
		BorderPane pane = new BorderPane();
		pane.setCenter(b1);
		
		final Scene myScene = new Scene(pane);
		
		final Button b2 = new Button("Click me!!!!");
		b2.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				NodeFixture<Button> b1Fixture = new NodeFixture<Button>(myScene, "b1");
				b1Fixture.mouse().click();
			}
		});
		pane.setBottom(b2);
		
		primaryStage.setScene(myScene);
		primaryStage.setTitle("MarvFX Demo1");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
