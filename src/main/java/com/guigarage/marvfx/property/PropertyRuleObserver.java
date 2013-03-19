package com.guigarage.marvfx.property;


public class PropertyRuleObserver<U> {

	private AbstractPropertyFutureRule<U> rule;
	
	public PropertyRuleObserver(AbstractPropertyFutureRule<U> rule) {
		this.rule = rule;
	}
	
	public final Iterable<RuleFail> check() {
		return rule.check();
	}
	
	public final boolean isStillNotFailed() {
		return !rule.check().iterator().hasNext();
	}
}
