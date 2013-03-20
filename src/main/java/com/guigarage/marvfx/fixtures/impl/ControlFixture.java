package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.control.Control;

import com.guigarage.marvfx.property.impl.ContextMenuPropertySupervisor;
import com.guigarage.marvfx.property.impl.SkinPropertySupervisor;
import com.guigarage.marvfx.property.impl.TooltipPropertySupervisor;

public class ControlFixture<T extends Control> extends RegionFixture<T> {

	public ControlFixture(T node) {
		super(node);
	}
	
	public ControlFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public ContextMenuPropertySupervisor createSupervisorForContextMenu() {
		return new ContextMenuPropertySupervisor(getNode().contextMenuProperty());
	}
	
	public SkinPropertySupervisor createSupervisorForSkin() {
		return new SkinPropertySupervisor(getNode().skinProperty());
	}
	
	public TooltipPropertySupervisor createSupervisorForTooltip() {
		return new TooltipPropertySupervisor(getNode().tooltipProperty());
	}
}
