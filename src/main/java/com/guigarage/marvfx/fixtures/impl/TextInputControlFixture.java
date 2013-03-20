package com.guigarage.marvfx.fixtures.impl;

import java.util.concurrent.Callable;

import javafx.scene.Scene;
import javafx.scene.control.IndexRange;
import javafx.scene.control.TextInputControl;
import javafx.scene.text.Font;

import com.guigarage.marvfx.property.impl.BooleanPropertySupervisor;
import com.guigarage.marvfx.property.impl.FontPropertySupervisor;
import com.guigarage.marvfx.property.impl.IndexRangePropertySupervisor;
import com.guigarage.marvfx.property.impl.NumberPropertySupervisor;
import com.guigarage.marvfx.property.impl.StringPropertySupervisor;
import com.guigarage.marvfx.util.MarvinFxUtilities;

public class TextInputControlFixture<T extends TextInputControl> extends ControlFixture<T> {

	public TextInputControlFixture(Scene scene, String nodeId) {
		super(scene, nodeId);
	}

	public TextInputControlFixture(T node) {
		super(node);
	}
	
	public StringPropertySupervisor createTextPropertySupervisor() {
		return new StringPropertySupervisor(getNode().textProperty());
	}
	
	public StringPropertySupervisor createPromptTextPropertySupervisor() {
		return new StringPropertySupervisor(getNode().promptTextProperty());
	}
	
	public IndexRangePropertySupervisor createSelectionPropertySupervisor() {
		return new IndexRangePropertySupervisor(getNode().selectionProperty());
	}
	
	public StringPropertySupervisor createSelectedTextPropertySupervisor() {
		return new StringPropertySupervisor(getNode().selectedTextProperty());
	}
	
	public BooleanPropertySupervisor createEditablePropertySupervisor() {
		return new BooleanPropertySupervisor(getNode().editableProperty());
	}
	
	public FontPropertySupervisor createFontPropertySupervisor() {
		return new FontPropertySupervisor(getNode().fontProperty());
	}
	
	public NumberPropertySupervisor createAnchorPropertySupervisor() {
		return new NumberPropertySupervisor(getNode().anchorProperty());
	}

	public NumberPropertySupervisor createCaretPositionPropertySupervisor() {
		return new NumberPropertySupervisor(getNode().caretPositionProperty());
	}
	
	public NumberPropertySupervisor createLenghtPropertySupervisor() {
		return new NumberPropertySupervisor(getNode().lengthProperty());
	}
	
	public void setText(final String text) {
		try {
			MarvinFxUtilities.runCallableInPlatformThread(new Callable<Void>() {

				@Override
				public Void call() throws Exception {
					getNode().setText(text);
					return null;
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getText() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<String>() {

				@Override
				public String call() throws Exception {
					return getNode().getText();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void setPromptText(final String text) {
		try {
			MarvinFxUtilities.runCallableInPlatformThread(new Callable<Void>() {

				@Override
				public Void call() throws Exception {
					getNode().setPromptText(text);
					return null;
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getPromptText() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<String>() {

				@Override
				public String call() throws Exception {
					return getNode().getPromptText();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public IndexRange getSelection() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<IndexRange>() {

				@Override
				public IndexRange call() throws Exception {
					return getNode().getSelection();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getSelectedText() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<String>() {

				@Override
				public String call() throws Exception {
					return getNode().getSelectedText();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void setEditable(final boolean editable) {
		try {
			MarvinFxUtilities.runCallableInPlatformThread(new Callable<Void>() {

				@Override
				public Void call() throws Exception {
					getNode().setEditable(editable);
					return null;
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean isEditable() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return getNode().isEditable();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void setFont(final Font font) {
		try {
			MarvinFxUtilities.runCallableInPlatformThread(new Callable<Void>() {

				@Override
				public Void call() throws Exception {
					getNode().setFont(font);
					return null;
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public Font getFont() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<Font>() {

				@Override
				public Font call() throws Exception {
					return getNode().getFont();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public int getAnchor() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					return getNode().getAnchor();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public int getCaretPosition() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					return getNode().getCaretPosition();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public int getLength() {
		try {
			return MarvinFxUtilities.runCallableInPlatformThread(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					return getNode().getLength();
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
