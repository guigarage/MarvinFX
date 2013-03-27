package com.guigarage.marvfx.runtime;

import javafx.stage.Stage;

public class MarvinFXMLWrapper {

    private Stage stage;
    
    private Object controller;
    
    protected MarvinFXMLWrapper(Stage stage, Object controller) {
        this.stage = stage;
        this.controller = controller;
    }
    
    @SuppressWarnings("unchecked")
    public <T> T getController() {
        return (T)controller;
    }
    
    public Stage getStage() {
        return stage;
    }
}
