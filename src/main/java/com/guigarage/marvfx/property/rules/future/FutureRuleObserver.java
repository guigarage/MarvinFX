package com.guigarage.marvfx.property.rules.future;

import com.guigarage.marvfx.property.rules.RuleFail;


public class FutureRuleObserver<U> {

	private AbstractPropertyFutureRule<U> rule;
	
	public FutureRuleObserver(AbstractPropertyFutureRule<U> rule) {
		this.rule = rule;
	}
	
	public final Iterable<RuleFail> check() {
		return rule.check();
	}
	
	public final boolean isStillNotFailed() {
		return !rule.check().iterator().hasNext();
	}
}
