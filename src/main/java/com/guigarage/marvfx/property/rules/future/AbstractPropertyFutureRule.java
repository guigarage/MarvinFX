package com.guigarage.marvfx.property.rules.future;

import java.util.ArrayList;
import java.util.List;

import com.guigarage.marvfx.property.rules.MarvinPropertyRule;
import com.guigarage.marvfx.property.rules.RuleFail;
import com.guigarage.marvfx.property.rules.RuleFailThrowable;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public abstract class AbstractPropertyFutureRule<U> implements ChangeListener<U>, MarvinPropertyRule<U>{

	private List<RuleFail> fails;
	
	public AbstractPropertyFutureRule() {
		fails = new ArrayList<>();
	}
	
	@Override
	public void changed(ObservableValue<? extends U> observable, U oldValue,
			U newValue) {
		check(oldValue, newValue);
	}

	protected abstract void check(U oldValue,
			U newValue);
	
	protected void fail() {
		fails.add(new RuleFail(new RuleFailThrowable()));
	}
	
	protected void fail(String message) {
		fails.add(new RuleFail(new RuleFailThrowable(), message));
	}
	
	protected RuleFail checkConfirmation() {
		return null;
	}
	
	public final Iterable<RuleFail> check() {
		List<RuleFail> allFails = new ArrayList<>(fails);
		RuleFail checkConfirmationFail = checkConfirmation();
		if(checkConfirmationFail != null) {
			allFails.add(checkConfirmationFail);
		}
		return allFails;
	}
	
	public FutureRuleObserver<U> createObserver() {
		return new FutureRuleObserver<>(this);
	}
}
