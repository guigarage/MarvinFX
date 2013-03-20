package com.guigarage.marvfx.property.impl;

import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;

import com.guigarage.marvfx.property.PropertySupervisor;

public class EventHandlerPropertySupervisor<T extends Event> extends PropertySupervisor<EventHandler<T>>{

	public EventHandlerPropertySupervisor(
			ObservableValue<EventHandler<T>> observable) {
		super(observable);
	}

}
