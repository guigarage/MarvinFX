package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.scene.media.MediaPlayer;

import com.guigarage.marvfx.property.PropertySupervisor;

public class MediaPlayerPropertySupervisor extends PropertySupervisor<MediaPlayer> {

	public MediaPlayerPropertySupervisor(ObservableValue<MediaPlayer> observable) {
		super(observable);
	}

}
