package com.guigarage.marvfx.fixtures.impl;

import javafx.scene.Scene;
import javafx.scene.web.WebView;

public class WebViewFixture extends ParentFixture<WebView> {

	public WebViewFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public WebViewFixture(WebView node) {
		super(node);
	}

}
