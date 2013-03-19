package com.guigarage.marvfx.property.rules;

import com.guigarage.marvfx.property.AbstractPropertyFutureRule;

public class StringWillAlwaysEndWithRule extends AbstractPropertyFutureRule<String> {

	private String suffix;
	
	public StringWillAlwaysEndWithRule(String suffix) {
		this.suffix = suffix;
	}
	
	@Override
	protected void check(String oldValue, String newValue) {
		if(newValue == null) {
			fail();
		}
		if(!newValue.endsWith(suffix)) {
			fail();
		}
	}

}