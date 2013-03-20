package com.guigarage.marvfx.property.rules.present;

import com.guigarage.marvfx.property.rules.MarvinPropertyRule;

import javafx.beans.value.ObservableValue;

public abstract class AbstractPropertyPresentRule<U> implements MarvinPropertyRule<U>{
	
	public abstract boolean check(ObservableValue<U> observable);
	
	public OrRule<U> or(AbstractPropertyPresentRule<U> otherRule) {
		return new OrRule<U>(this, otherRule);
	}
}
