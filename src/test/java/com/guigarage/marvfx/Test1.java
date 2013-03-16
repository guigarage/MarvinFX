package com.guigarage.marvfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import com.guigarage.marvfx.robot.MarvinFxRobot;
import com.guigarage.marvfx.robot.MarvinFxRobotFactory;

public class Test1 extends Application {

	public void start(Stage primaryStage) throws Exception {
		final Button b1 = new Button("Hello MarvFX");
		BorderPane pane = new BorderPane();
		pane.setCenter(b1);
		
		final Scene myScene = new Scene(pane);
		
		final Button b2 = new Button("Click me!!!!");
		b2.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				MarvinFxRobot controller = MarvinFxRobotFactory.create(myScene);
				controller.centerMouseOnNode(b1);
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
