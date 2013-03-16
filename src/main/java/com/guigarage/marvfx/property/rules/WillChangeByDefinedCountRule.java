package com.guigarage.marvfx.property.rules;

import com.guigarage.marvfx.property.AbstractPropertyRule;
import com.guigarage.marvfx.property.RuleFail;

public class WillChangeByDefinedCountRule<U> extends
		AbstractPropertyRule<U> {

	private int count;
	
	private int currentCount;
	
	public WillChangeByDefinedCountRule(int count) {
		this.count = count;
	}
	
	@Override
	protected void check(U oldValue, U newValue) {
		currentCount++;
		if(currentCount > count) {
			fail();
		}
	}
	
	@Override
	public RuleFail checkConfirmation() {
		if(count != currentCount) {
			return new RuleFail();
		}
		return super.checkConfirmation();
	}
}
