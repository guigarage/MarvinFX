package com.guigarage.marvfx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBoxBuilder;
import javafx.stage.Stage;

import org.junit.Test;

import com.guigarage.marvfx.fixtures.NodeFixture;
import com.guigarage.marvfx.fixtures.TextfieldFixture;
import com.guigarage.marvfx.property.PropertySupervisor;

public class UnitTests {

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
		buttonTextSupervisor.assertCurrentValue("clicked...");
		MarvinFx.sleep(2000);
	}
	
	@Test
	public void test4() {
		final TextField textField = new TextField("1");
		Button button = new Button("Button");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				int value = Integer.parseInt(textField.getText()) * 2;
				textField.setText(value + "");
			}
		});
		MarvinFx.show(VBoxBuilder.create().children(textField, button).build());
		
		TextfieldFixture textfieldFixture = new TextfieldFixture(textField);
		PropertySupervisor<String> textSupervisor = textfieldFixture.createTextPropertySupervisor();
		NodeFixture<Button> buttonFixture = new NodeFixture<Button>(button);
		
		textSupervisor.assertValueIsNotNull();
		textSupervisor.assertCurrentValue("1");
		buttonFixture.mouse().click();
		textSupervisor.assertCurrentValue("2");
		
		textSupervisor.assertWillChange();
		textSupervisor.assertWillChangeByDefinedCount(4);
		textSupervisor.assertWillChangeThisWay("4", "8", "16", "32");
		buttonFixture.mouse().click(4);
		textSupervisor.confirm();
		
		textSupervisor.assertWillNeverChange();
		textSupervisor.confirm();
		
		textSupervisor.assertWillChange();
		textSupervisor.assertWillChangeByDefinedCount(2);
		textSupervisor.assertWillChangeThisWay("7", "14");
		textfieldFixture.setText("7");
		buttonFixture.mouse().click();
		textSupervisor.confirm();
	}
}
