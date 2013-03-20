package com.guigarage.marvfx.property.impl;

import java.util.concurrent.Callable;

import javafx.beans.value.ObservableValue;

import com.guigarage.marvfx.MarvinFx;
import com.guigarage.marvfx.property.PropertySupervisor;
import com.guigarage.marvfx.property.rules.future.FutureRuleObserver;
import com.guigarage.marvfx.property.rules.future.StringWillAlwaysEndWithRule;
import com.guigarage.marvfx.property.rules.future.StringWillAlwaysStartWithRule;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class StringPropertySupervisor extends PropertySupervisor<String> {

	public StringPropertySupervisor(ObservableValue<String> observable) {
		super(observable);
	}

	public void assertStringLenght(final int length) {
		Callable<Boolean> checkCallable = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				if(getObservable().getValue() == null) {
					return Boolean.FALSE;
				}
				if (getObservable().getValue().length() == length) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
			}
		};
		try {
			if (!MarvinFxUtilities.runCallableInPlatformThread(checkCallable)) {
				MarvinFx.getInstance().getFail().fail();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void assertStringIsEmpty() {
		Callable<Boolean> checkCallable = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				if(getObservable().getValue() == null) {
					return Boolean.FALSE;
				}
				if (getObservable().getValue().isEmpty()) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
			}
		};
		try {
			if (!MarvinFxUtilities.runCallableInPlatformThread(checkCallable)) {
				MarvinFx.getInstance().getFail().fail();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void assertStringStartsWith(final String prefix) {
		Callable<Boolean> checkCallable = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				if(getObservable().getValue() == null) {
					return Boolean.FALSE;
				}
				if (getObservable().getValue().startsWith(prefix)) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
			}
		};
		try {
			if (!MarvinFxUtilities.runCallableInPlatformThread(checkCallable)) {
				MarvinFx.getInstance().getFail().fail();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void assertStringEndsWith(final String suffix) {
		Callable<Boolean> checkCallable = new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				if(getObservable().getValue() == null) {
					return Boolean.FALSE;
				}
				if (getObservable().getValue().endsWith(suffix)) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
			}
		};
		try {
			if (!MarvinFxUtilities.runCallableInPlatformThread(checkCallable)) {
				MarvinFx.getInstance().getFail().fail();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public FutureRuleObserver<String> assertStringWillAlwaysStartWith(String prefix) {
		return addFutureRule(new StringWillAlwaysStartWithRule(prefix));
	}
	
	public FutureRuleObserver<String> assertStringWillAlwaysEndWith(String suffix) {
		return addFutureRule(new StringWillAlwaysEndWithRule(suffix));
	}
}
