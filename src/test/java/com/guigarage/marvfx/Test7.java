package com.guigarage.marvfx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.junit.Test;

import com.guigarage.marvfx.fixtures.NodeFixture;
import com.guigarage.marvfx.property.PropertySupervisor;

public class Test7 {

	@Test
	public void test1() {
		final Button b1 = new Button("Hello MarvFX");
		BorderPane pane = new BorderPane();
		pane.setCenter(b1);
		
		MarvinFx.show(pane);
		MarvinFx.sleep(2000);
		NodeFixture<Button> b1Fixture = new NodeFixture<Button>(b1);
		b1Fixture.mouse().click();
		MarvinFx.sleep(2000);
	}
	
	@Test
	public void test2() {
		final Button b1 = new Button("Hello MarvFX 2");
		
		Stage s = MarvinFx.show(b1);
		s.setX(0);
		s.setY(0);
		MarvinFx.sleep(2000);
		NodeFixture<Button> b1Fixture = new NodeFixture<Button>(b1);
		b1Fixture.mouse().click();
		MarvinFx.sleep(2000);
	}
	
	@Test
	public void test3() {
		final Button b1 = new Button("Test123");
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				b1.setText("clicked...");
			}
		});
		MarvinFx.show(b1);
		PropertySupervisor<String> buttonTextSupervisor = new PropertySupervisor<>(b1.textProperty());
		buttonTextSupervisor.assertCurrentValue("Test123");
		NodeFixture<Button> b1Fixture = new NodeFixture<Button>(b1);
		b1Fixture.mouse().click();
		MarvinFx.sleep(50);
		buttonTextSupervisor.assertCurrentValue("clicked...");
	}
}
