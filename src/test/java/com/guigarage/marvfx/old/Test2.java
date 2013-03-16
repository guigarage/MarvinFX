package com.guigarage.marvfx.old;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import com.guigarage.marvfx.robot.MarvinFxRobot;
import com.guigarage.marvfx.robot.MarvinFxRobotFactory;
import com.guigarage.marvfx.robot.MarvinFxRobotType;

public class Test2 extends Application {

	public void start(Stage primaryStage) throws Exception {
		final Button b1 = new Button("Hello MarvFX");
		b1.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				System.out.println("b1 was clicked");
			}
		});
		
		
		final BorderPane pane = new BorderPane();
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
		primaryStage.setTitle("MarvFX Demo2");
		primaryStage.show();
		
		pane.setTranslateX(25);
		pane.setTranslateY(63);
		pane.setRotate(34);
		b1.setTranslateX(54);
		b1.setTranslateY(28);
		b1.setRotate(84);
	}

	public static void main(String[] args) {
		launch(args);
	}
}