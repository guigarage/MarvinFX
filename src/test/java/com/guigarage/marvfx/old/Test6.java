package com.guigarage.marvfx.old;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import com.guigarage.marvfx.property.PropertySupervisor;

public class Test6 extends Application {

	public void start(Stage primaryStage) throws Exception {
		final TextField t1 = new TextField();
		t1.setText("Hello");
		
		final BorderPane pane = new BorderPane();
		pane.setCenter(t1);
		
		
		final Scene myScene = new Scene(pane);
		
		final Button b2 = new Button("Click me!!!!");
		b2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				PropertySupervisor<String> textPropertySupervisor = new PropertySupervisor<>(t1.textProperty());
				textPropertySupervisor.assertValueIsEquals("Hello");
				textPropertySupervisor.assertWillChange();
				textPropertySupervisor.assertWillChangeByDefinedCount(1);
				t1.setText("123");
				//Will fail if a rule is broken
				textPropertySupervisor.confirm();
				
				//remove all rules
				textPropertySupervisor.reset();
				textPropertySupervisor.assertWillNeverChange();
				textPropertySupervisor.confirm();
				
				textPropertySupervisor.reset();
				textPropertySupervisor.assertWillChange();
				textPropertySupervisor.assertWillChangeByDefinedCount(3);
				textPropertySupervisor.assertWillChangeThisWay("A", "B", "C");
				t1.setText("A");
				t1.setText("B");
				t1.setText("C");
				textPropertySupervisor.confirm();
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