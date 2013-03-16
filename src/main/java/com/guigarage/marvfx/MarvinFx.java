package com.guigarage.marvfx;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import com.guigarage.marvfx.robot.MarvinFxRobotType;
import com.guigarage.marvfx.runtime.MarvinFxRuntime;
import com.guigarage.marvfx.util.DefaultFail;
import com.guigarage.marvfx.util.MarvinFxFail;


public class MarvinFx {

	private static MarvinFx instance = new MarvinFx();
	
	private MarvinFxRobotType robotType = MarvinFxRobotType.AWT_ROBOT;
	
	private MarvinFxFail fail = new DefaultFail();
	
	public MarvinFx() {
	}
	
	public MarvinFxRobotType getRobotType() {
		return robotType;
	}
	
	public void setRobotType(MarvinFxRobotType robotType) {
		this.robotType = robotType;
	}
	
	public MarvinFxFail getFail() {
		return fail;
	}
	
	public void setFail(MarvinFxFail fail) {
		this.fail = fail;
	}
	
	public static Stage show(Scene scene) {
		return MarvinFxRuntime.show(scene);
	}
	
	public static Stage show(Parent parent) {
		return MarvinFxRuntime.show(parent);
	}
	
	public static Stage show(Node node) {
		return MarvinFxRuntime.show(node);
	}
	
	public static void sleep(Duration duration) {
		sleep((long) duration.toMillis());
	}
	
	public static void sleep(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			throw new RuntimeException("Test was interrupted", e);
		}
	}
	
	public static MarvinFx getInstance() {
		return instance;
	}
}
