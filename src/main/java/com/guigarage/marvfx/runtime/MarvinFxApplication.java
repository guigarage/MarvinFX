package com.guigarage.marvfx.runtime;

import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.stage.Stage;


public class MarvinFxApplication extends Application {

	private static boolean applicationCreated = false;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		applicationCreated = true;
	}
	
	private static void innerLaunch() {
		launch(null);
	}
	
	public static void launch() {
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			
			@Override
			public void run() {
				innerLaunch();
			}
		});
		while(!applicationCreated) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				throw new RuntimeException("Can't create JavaFX runtime", e);
			}
		}
	}
}
