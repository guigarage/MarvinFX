package com.guigarage.marvfx.property.rules.future;

import com.guigarage.marvfx.property.rules.RuleFail;

public class WillChangeThisWayRule<U> extends AbstractPropertyFutureRule<U> {

	private U[] assertedValues;

	private int currentIndex;

	@SuppressWarnings("unchecked")
	public WillChangeThisWayRule(U... assertedValues) {
		this.assertedValues = assertedValues;
		currentIndex = 0;
	}

	@Override
	protected void check(U oldValue, U newValue) {
		try {
			if(currentIndex > assertedValues.length - 1) {
				fail();
				return;
			}
			if (newValue == null) {
				if (assertedValues[currentIndex] != null) {
					fail();
					return;
				}
				return;
			}
			if (assertedValues[currentIndex] == null) {
				fail();
				return;
			}
			if (!newValue.equals(assertedValues[currentIndex])) {
				fail();
				return;
			}
		} finally {
			currentIndex++;
		}
	}

	@Override
	public RuleFail checkConfirmation() {
		if(currentIndex != assertedValues.length) {
			return new RuleFail();
		}
		return super.checkConfirmation();
	}
}
