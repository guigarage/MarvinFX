package com.guigarage.marvfx.util;

public class DefaultFail implements MarvinFxFail {

	@Override
	public void fail() {
		throw new AssertionError();
	}

	@Override
	public void fail(String text) {
		throw new AssertionError(text);
	}

	@Override
	public void fail(Throwable cause) {
		throw new AssertionError(cause);
	}

	@Override
	public void fail(String text, Throwable cause) {
		throw new AssertionError(text, cause);
	}

}
