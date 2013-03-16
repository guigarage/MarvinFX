package com.guigarage.marvfx.property.rules;

import com.guigarage.marvfx.property.AbstractPropertyRule;

public class WillNeverChangeRule<U> extends AbstractPropertyRule<U> {

	private boolean touchAllowed;
	
	public WillNeverChangeRule() {
		this(true);
	}
	
	public WillNeverChangeRule(boolean touchAllowed) {
		this.touchAllowed = touchAllowed;
	}
	
	@Override
	protected void check(U oldValue, U newValue) {
		if(oldValue == null && newValue == null) {
			if(!touchAllowed) {
				fail();
				return;
			}
			return;
		}
		if(oldValue != null && newValue == null) {
			fail();
			return;
		}
		if(oldValue == null && newValue != null) {
			fail();
			return;
		}
		if(oldValue.equals(newValue) && !touchAllowed) {
			fail();
			return;
		}
		if(!oldValue.equals(newValue)) {
			fail();
			return;
		}
	}

}
