package com.guigarage.marvfx.robot;

import javafx.scene.Scene;

import com.guigarage.marvfx.MarvinFx;
import com.guigarage.marvfx.robot.impl.AwtBasedRobot;
import com.guigarage.marvfx.robot.impl.FxBasedRobot;

public class MarvinFxRobotFactory {

	public static MarvinFxRobot create(Scene scene) {
		MarvinFxRobotType robotType = MarvinFx.getInstance().getRobotType();
		if(robotType.equals(MarvinFxRobotType.AWT_ROBOT)) {
			return new AwtBasedRobot(scene, false);
		} else if(robotType.equals(MarvinFxRobotType.AWT_HEADLESS_ROBOT)) {
			return new AwtBasedRobot(scene, true);
		}
		return new FxBasedRobot(scene);
	}
}
