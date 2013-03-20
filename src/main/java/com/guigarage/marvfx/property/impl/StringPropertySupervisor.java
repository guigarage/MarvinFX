package com.guigarage.marvfx.property.impl;

import java.util.concurrent.Callable;

import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.MarvinFx;
import com.guigarage.marvfx.property.PropertySupervisor;
import com.guigarage.marvfx.property.rules.future.FutureRuleObserver;
import com.guigarage.marvfx.property.rules.future.StringWillAlwaysEndWithRule;
import com.guigarage.marvfx.property.rules.future.StringWillAlwaysStartWithRule;
import com.guigarage.marvfx.property.rules.present.StringEndsWithRule;
import com.guigarage.marvfx.property.rules.present.StringIsEmptyRule;
import com.guigarage.marvfx.property.rules.present.StringLenghtIsGreaterThanRule;
import com.guigarage.marvfx.property.rules.present.StringLenghtIsLessThanRule;
import com.guigarage.marvfx.property.rules.present.StringLengthIsEqualsRule;
import com.guigarage.marvfx.property.rules.present.StringStartsWithRule;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class StringPropertySupervisor extends PropertySupervisor<String> {

	public StringPropertySupervisor(ObservableValue<String> observable) {
		super(observable);
	}
	
	public void assertStringLenghtIsEquals(int lenght) {
		assertPresentRule(new StringLengthIsEqualsRule(lenght));
	}
	
	public void assertStringLenghtIsGreaterThan(int lenght) {
		assertPresentRule(new StringLenghtIsGreaterThanRule(lenght));
	}
	
	public void assertStringLenghtIsLessThan(int lenght) {
		assertPresentRule(new StringLenghtIsLessThanRule(lenght));
	}
	
	public void assertStringIsEmpty() {
		assertPresentRule(new StringIsEmptyRule());
	}

	public void assertStringStartsWith(final String prefix) {
		assertPresentRule(new StringStartsWithRule(prefix));
	}
	
	public void assertStringEndsWith(final String suffix) {
		assertPresentRule(new StringEndsWithRule(suffix));
	}
	
	public FutureRuleObserver<String> assertStringWillAlwaysStartWith(String prefix) {
		return addFutureRule(new StringWillAlwaysStartWithRule(prefix));
	}
	
	public FutureRuleObserver<String> assertStringWillAlwaysEndWith(String suffix) {
		return addFutureRule(new StringWillAlwaysEndWithRule(suffix));
	}
}
