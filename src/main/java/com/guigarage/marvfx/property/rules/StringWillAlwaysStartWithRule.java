package com.guigarage.marvfx.property.rules;

import com.guigarage.marvfx.property.AbstractPropertyFutureRule;

public class StringWillAlwaysStartWithRule extends AbstractPropertyFutureRule<String> {

	private String prefix;
	
	public StringWillAlwaysStartWithRule(String prefix) {
		this.prefix = prefix;
	}
	
	@Override
	protected void check(String oldValue, String newValue) {
		if(newValue == null) {
			fail();
		}
		if(!newValue.startsWith(prefix)) {
			fail();
		}
	}

}
