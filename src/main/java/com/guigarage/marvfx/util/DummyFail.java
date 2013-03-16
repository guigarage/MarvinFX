package com.guigarage.marvfx.util;

public class DummyFail implements MarvinFxFail {

	@Override
	public void fail() {
		System.out.println("FAIL!!");
	}

	@Override
	public void fail(String text) {
		System.out.println("FAIL!! - " + text);
	}

}
