package com.guigarage.marvfx.property.rules.present;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javafx.beans.value.ObservableValue;

public class OrRule<U> extends AbstractPropertyPresentRule<U> {

	private List<AbstractPropertyPresentRule<U>> rules;
	
	public OrRule(AbstractPropertyPresentRule<U>... rules) {
		this.rules = new CopyOnWriteArrayList<>(rules);
	}

	@Override
	public boolean check(ObservableValue<U> observable) {
		for(AbstractPropertyPresentRule<U> rule : rules) {
			if(rule.check(observable)) {
				return true;
			}
		}
		return false;
	}
}
