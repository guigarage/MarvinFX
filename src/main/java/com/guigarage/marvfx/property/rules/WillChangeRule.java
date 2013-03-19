package com.guigarage.marvfx.property.rules;

import com.guigarage.marvfx.property.AbstractPropertyFutureRule;
import com.guigarage.marvfx.property.RuleFail;

public class WillChangeRule<U> extends AbstractPropertyFutureRule<U> {

	private boolean changed = false;
	
	@Override
	protected void check(U oldValue, U newValue) {
		changed = true;
	}

	@Override
	public RuleFail checkConfirmation() {
		if(!changed) {
			return new RuleFail();
		}
		return super.checkConfirmation();
	}
}
