package com.guigarage.marvfx.property.rules.future;

import com.guigarage.marvfx.property.rules.RuleFail;

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
