package com.guigarage.marvfx.property.rules;

import java.util.Arrays;

public class RuleFail {

	private String message;
	
	private Throwable t;
	
	public RuleFail() {
		this(new RuleFailThrowable(), "");
	}
	
	public RuleFail(Throwable t) {
		this(t, "");
	}
	
	public RuleFail(Throwable t, String message) {
		this.message = message;
		this.t = t;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Iterable<StackTraceElement> getStackTrace() {
		return Arrays.asList(t.getStackTrace());
	}
}
