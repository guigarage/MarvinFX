package com.guigarage.marvfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import com.guigarage.marvfx.fixtures.NodeFixture;
import com.guigarage.marvfx.robot.MarvinFxRobotType;
import com.sun.javafx.scene.control.skin.KeyCodeUtils;
import com.sun.javafx.webkit.KeyCodeMap;

public class TestKeyboard extends Application {

	public void start(Stage primaryStage) throws Exception {
		// MarvinFx.getInstance().setRobotType(MarvinFxRobotType.FX_ROBOT);
		final TextField t1 = new TextField();
		t1.setId("t1");

		t1.setOnKeyTyped(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				for (char iterable_element : event.getCharacter().toCharArray()) {
					System.out.print((int) iterable_element);
				}
				System.out.println("");

			}
		});

		final BorderPane pane = new BorderPane();
		pane.setCenter(t1);

		final Scene myScene = new Scene(pane);

		final Button b2 = new Button("Click me!!!!");
		b2.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				NodeFixture<TextField> b1Fixture = new NodeFixture<TextField>(
						myScene, "t1");
				b1Fixture.getKeyboard().type("Hallo");

				// KeyCode[] codes = KeyCode.values();
				//
				// for (KeyCode keyCode : codes) {
				// System.out
				// .print("charToKeyCodeMap.put(new Character((char)");
				// for (char iterable_element : keyCode.impl_getChar()
				// .toCharArray()) {
				// System.out.print((int) iterable_element);
				// }
				// System.out.print("), KeyCode.");
				// System.out.print(keyCode);
				// System.out.println(");");
				//
				// }

			}
		});
		pane.setBottom(b2);
		primaryStage.setScene(myScene);
		primaryStage.setTitle("MarvFX Demo3");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}