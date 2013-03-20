package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.media.MediaView;

import com.guigarage.marvfx.fixtures.NodeFixture;
import com.guigarage.marvfx.property.impl.BooleanPropertySupervisor;
import com.guigarage.marvfx.property.impl.MediaPlayerPropertySupervisor;
import com.guigarage.marvfx.property.impl.NumberPropertySupervisor;
import com.guigarage.marvfx.property.impl.Rectangle2DPropertySupervisor;

public class MediaViewFixture<T extends MediaView> extends NodeFixture<T> {

	public MediaViewFixture(T node) {
		super(node);
	}

	public MediaViewFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public NumberPropertySupervisor createSupervisorForFitWidth() {
		return new NumberPropertySupervisor(getNode().fitWidthProperty());
	}
	
	public NumberPropertySupervisor createSupervisorForFitHeight() {
		return new NumberPropertySupervisor(getNode().fitHeightProperty());
	}
	
	public MediaPlayerPropertySupervisor createSupervisorForMediaPlayer() {
		return new MediaPlayerPropertySupervisor(getNode().mediaPlayerProperty());
	}
	
	public BooleanPropertySupervisor createSupervisorForPreserveRatio() {
		return new BooleanPropertySupervisor(getNode().preserveRatioProperty());
	}
	
	public BooleanPropertySupervisor createSupervisorForSmooth() {
		return new BooleanPropertySupervisor(getNode().smoothProperty());
	}
	
	public Rectangle2DPropertySupervisor createSupervisorForViewport() {
		return new Rectangle2DPropertySupervisor(getNode().viewportProperty());
	}
	
	public NumberPropertySupervisor createSupervisorForX() {
		return new NumberPropertySupervisor(getNode().xProperty());
	}
	
	public NumberPropertySupervisor createSupervisorForY() {
		return new NumberPropertySupervisor(getNode().yProperty());
	}
}
