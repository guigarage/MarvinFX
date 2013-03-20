package com.guigarage.marvfx.property.rules.present;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javafx.beans.value.ObservableValue;

public class AndRule<U> extends AbstractPropertyPresentRule<U> {

	private List<AbstractPropertyPresentRule<U>> rules;
	
	public AndRule(AbstractPropertyPresentRule<U>... rules) {
		this.rules = new CopyOnWriteArrayList<>(rules);
	}

	@Override
	public boolean check(ObservableValue<U> observable) {
		for(AbstractPropertyPresentRule<U> rule : rules) {
			if(!rule.check(observable)) {
				return false;
			}
		}
		return true;
	}
}
