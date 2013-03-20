package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;

import com.guigarage.marvfx.fixtures.NodeFixture;
import com.guigarage.marvfx.property.impl.BooleanPropertySupervisor;
import com.guigarage.marvfx.property.impl.ImagePropertySupervisor;
import com.guigarage.marvfx.property.impl.NumberPropertySupervisor;
import com.guigarage.marvfx.property.impl.Rectangle2DPropertySupervisor;

public class ImageViewFixture<T extends ImageView> extends NodeFixture<T> {

	public ImageViewFixture(T node) {
		super(node);
	}

	public ImageViewFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public NumberPropertySupervisor createSupervisorForFitWidth() {
		return new NumberPropertySupervisor(getNode().fitWidthProperty());
	}
	
	public NumberPropertySupervisor createSupervisorForFitHeight() {
		return new NumberPropertySupervisor(getNode().fitHeightProperty());
	}
	
	public ImagePropertySupervisor createSupervisorForImage() {
		return new ImagePropertySupervisor(getNode().imageProperty());
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
