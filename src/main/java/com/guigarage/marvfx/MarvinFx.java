package com.guigarage.marvfx;

import com.guigarage.marvfx.robot.MarvinFxRobotType;
import com.guigarage.marvfx.util.DummyFail;
import com.guigarage.marvfx.util.MarvinFxFail;


public class MarvinFx {

	private static MarvinFx instance = new MarvinFx();
	
	private MarvinFxRobotType robotType = MarvinFxRobotType.AWT_ROBOT;
	
	private MarvinFxFail fail = new DummyFail();
	
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
	
	public static MarvinFx getInstance() {
		return instance;
	}
}
