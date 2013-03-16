package com.guigarage.marvfx.util;

public interface MarvinFxFail {

	void fail();
	
	void fail(String text);
	
	void fail(Throwable cause);
	
	void fail(String text, Throwable cause);
}
