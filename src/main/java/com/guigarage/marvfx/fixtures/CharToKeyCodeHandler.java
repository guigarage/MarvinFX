package com.guigarage.marvfx.fixtures;

import java.util.HashMap;

import javafx.scene.input.KeyCode;

public class CharToKeyCodeHandler {

	private static CharToKeyCodeHandler instance;

	private HashMap<Character, KeyCode> charToKeyCodeMap;

	private CharToKeyCodeHandler() {
		initHashMap();
	}

	public static CharToKeyCodeHandler getInstance() {
		if (instance == null) {
			instance = new CharToKeyCodeHandler();
		}
		return instance;
	}

	private void initHashMap() {
		if (charToKeyCodeMap == null) {
			charToKeyCodeMap = new HashMap<>();
			charToKeyCodeMap.put(new Character((char) 10), KeyCode.ENTER);
			charToKeyCodeMap.put(new Character((char) 10), KeyCode.ENTER);
			charToKeyCodeMap.put(new Character((char) 8), KeyCode.BACK_SPACE);
			charToKeyCodeMap.put(new Character((char) 9), KeyCode.TAB);
			charToKeyCodeMap.put(new Character((char) 3), KeyCode.CANCEL);
			charToKeyCodeMap.put(new Character((char) 12), KeyCode.CLEAR);
			charToKeyCodeMap.put(new Character((char) 16), KeyCode.SHIFT);
			charToKeyCodeMap.put(new Character((char) 17), KeyCode.CONTROL);
			charToKeyCodeMap.put(new Character((char) 18), KeyCode.ALT);
			charToKeyCodeMap.put(new Character((char) 19), KeyCode.PAUSE);
			charToKeyCodeMap.put(new Character((char) 20), KeyCode.CAPS);
			charToKeyCodeMap.put(new Character((char) 27), KeyCode.ESCAPE);
			charToKeyCodeMap.put(new Character((char) 32), KeyCode.SPACE);
			charToKeyCodeMap.put(new Character((char) 33), KeyCode.PAGE_UP);
			charToKeyCodeMap.put(new Character((char) 34), KeyCode.PAGE_DOWN);
			charToKeyCodeMap.put(new Character((char) 35), KeyCode.END);
			charToKeyCodeMap.put(new Character((char) 36), KeyCode.HOME);
			charToKeyCodeMap.put(new Character((char) 37), KeyCode.LEFT);
			charToKeyCodeMap.put(new Character((char) 38), KeyCode.UP);
			charToKeyCodeMap.put(new Character((char) 39), KeyCode.RIGHT);
			charToKeyCodeMap.put(new Character((char) 40), KeyCode.DOWN);
			charToKeyCodeMap.put(new Character((char) 44), KeyCode.COMMA);
			charToKeyCodeMap.put(new Character((char) 45), KeyCode.MINUS);
			charToKeyCodeMap.put(new Character((char) 46), KeyCode.PERIOD);
			charToKeyCodeMap.put(new Character((char) 47), KeyCode.SLASH);
			charToKeyCodeMap.put(new Character((char) 48), KeyCode.DIGIT0);
			charToKeyCodeMap.put(new Character((char) 49), KeyCode.DIGIT1);
			charToKeyCodeMap.put(new Character((char) 50), KeyCode.DIGIT2);
			charToKeyCodeMap.put(new Character((char) 51), KeyCode.DIGIT3);
			charToKeyCodeMap.put(new Character((char) 52), KeyCode.DIGIT4);
			charToKeyCodeMap.put(new Character((char) 53), KeyCode.DIGIT5);
			charToKeyCodeMap.put(new Character((char) 54), KeyCode.DIGIT6);
			charToKeyCodeMap.put(new Character((char) 55), KeyCode.DIGIT7);
			charToKeyCodeMap.put(new Character((char) 56), KeyCode.DIGIT8);
			charToKeyCodeMap.put(new Character((char) 57), KeyCode.DIGIT9);
			charToKeyCodeMap.put(new Character((char) 59), KeyCode.SEMICOLON);
			charToKeyCodeMap.put(new Character((char) 61), KeyCode.EQUALS);
			charToKeyCodeMap.put(new Character((char) 65), KeyCode.A);
			charToKeyCodeMap.put(new Character((char) 66), KeyCode.B);
			charToKeyCodeMap.put(new Character((char) 67), KeyCode.C);
			charToKeyCodeMap.put(new Character((char) 68), KeyCode.D);
			charToKeyCodeMap.put(new Character((char) 69), KeyCode.E);
			charToKeyCodeMap.put(new Character((char) 70), KeyCode.F);
			charToKeyCodeMap.put(new Character((char) 71), KeyCode.G);
			charToKeyCodeMap.put(new Character((char) 72), KeyCode.H);
			charToKeyCodeMap.put(new Character((char) 73), KeyCode.I);
			charToKeyCodeMap.put(new Character((char) 74), KeyCode.J);
			charToKeyCodeMap.put(new Character((char) 75), KeyCode.K);
			charToKeyCodeMap.put(new Character((char) 76), KeyCode.L);
			charToKeyCodeMap.put(new Character((char) 77), KeyCode.M);
			charToKeyCodeMap.put(new Character((char) 78), KeyCode.N);
			charToKeyCodeMap.put(new Character((char) 79), KeyCode.O);
			charToKeyCodeMap.put(new Character((char) 80), KeyCode.P);
			charToKeyCodeMap.put(new Character((char) 81), KeyCode.Q);
			charToKeyCodeMap.put(new Character((char) 82), KeyCode.R);
			charToKeyCodeMap.put(new Character((char) 83), KeyCode.S);
			charToKeyCodeMap.put(new Character((char) 84), KeyCode.T);
			charToKeyCodeMap.put(new Character((char) 85), KeyCode.U);
			charToKeyCodeMap.put(new Character((char) 86), KeyCode.V);
			charToKeyCodeMap.put(new Character((char) 87), KeyCode.W);
			charToKeyCodeMap.put(new Character((char) 88), KeyCode.X);
			charToKeyCodeMap.put(new Character((char) 89), KeyCode.Y);
			charToKeyCodeMap.put(new Character((char) 90), KeyCode.Z);
			charToKeyCodeMap
					.put(new Character((char) 91), KeyCode.OPEN_BRACKET);
			charToKeyCodeMap.put(new Character((char) 92), KeyCode.BACK_SLASH);
			charToKeyCodeMap.put(new Character((char) 93),
					KeyCode.CLOSE_BRACKET);
			charToKeyCodeMap.put(new Character((char) 96), KeyCode.NUMPAD0);
			charToKeyCodeMap.put(new Character((char) 97), KeyCode.NUMPAD1);
			charToKeyCodeMap.put(new Character((char) 98), KeyCode.NUMPAD2);
			charToKeyCodeMap.put(new Character((char) 99), KeyCode.NUMPAD3);
			charToKeyCodeMap.put(new Character((char) 100), KeyCode.NUMPAD4);
			charToKeyCodeMap.put(new Character((char) 101), KeyCode.NUMPAD5);
			charToKeyCodeMap.put(new Character((char) 102), KeyCode.NUMPAD6);
			charToKeyCodeMap.put(new Character((char) 103), KeyCode.NUMPAD7);
			charToKeyCodeMap.put(new Character((char) 104), KeyCode.NUMPAD8);
			charToKeyCodeMap.put(new Character((char) 105), KeyCode.NUMPAD9);
			charToKeyCodeMap.put(new Character((char) 106), KeyCode.MULTIPLY);
			charToKeyCodeMap.put(new Character((char) 107), KeyCode.ADD);
			charToKeyCodeMap.put(new Character((char) 108), KeyCode.SEPARATOR);
			charToKeyCodeMap.put(new Character((char) 109), KeyCode.SUBTRACT);
			charToKeyCodeMap.put(new Character((char) 110), KeyCode.DECIMAL);
			charToKeyCodeMap.put(new Character((char) 111), KeyCode.DIVIDE);
			charToKeyCodeMap.put(new Character((char) 127), KeyCode.DELETE);
			charToKeyCodeMap.put(new Character((char) 144), KeyCode.NUM_LOCK);
			charToKeyCodeMap
					.put(new Character((char) 145), KeyCode.SCROLL_LOCK);
			charToKeyCodeMap.put(new Character((char) 112), KeyCode.F1);
			charToKeyCodeMap.put(new Character((char) 113), KeyCode.F2);
			charToKeyCodeMap.put(new Character((char) 114), KeyCode.F3);
			charToKeyCodeMap.put(new Character((char) 115), KeyCode.F4);
			charToKeyCodeMap.put(new Character((char) 116), KeyCode.F5);
			charToKeyCodeMap.put(new Character((char) 117), KeyCode.F6);
			charToKeyCodeMap.put(new Character((char) 118), KeyCode.F7);
			charToKeyCodeMap.put(new Character((char) 119), KeyCode.F8);
			charToKeyCodeMap.put(new Character((char) 120), KeyCode.F9);
			charToKeyCodeMap.put(new Character((char) 121), KeyCode.F10);
			charToKeyCodeMap.put(new Character((char) 122), KeyCode.F11);
			charToKeyCodeMap.put(new Character((char) 123), KeyCode.F12);
			charToKeyCodeMap.put(new Character((char) 61440), KeyCode.F13);
			charToKeyCodeMap.put(new Character((char) 61441), KeyCode.F14);
			charToKeyCodeMap.put(new Character((char) 61442), KeyCode.F15);
			charToKeyCodeMap.put(new Character((char) 61443), KeyCode.F16);
			charToKeyCodeMap.put(new Character((char) 61444), KeyCode.F17);
			charToKeyCodeMap.put(new Character((char) 61445), KeyCode.F18);
			charToKeyCodeMap.put(new Character((char) 61446), KeyCode.F19);
			charToKeyCodeMap.put(new Character((char) 61447), KeyCode.F20);
			charToKeyCodeMap.put(new Character((char) 61448), KeyCode.F21);
			charToKeyCodeMap.put(new Character((char) 61449), KeyCode.F22);
			charToKeyCodeMap.put(new Character((char) 61450), KeyCode.F23);
			charToKeyCodeMap.put(new Character((char) 61451), KeyCode.F24);
			charToKeyCodeMap
					.put(new Character((char) 154), KeyCode.PRINTSCREEN);
			charToKeyCodeMap.put(new Character((char) 155), KeyCode.INSERT);
			charToKeyCodeMap.put(new Character((char) 156), KeyCode.HELP);
			charToKeyCodeMap.put(new Character((char) 157), KeyCode.META);
			charToKeyCodeMap.put(new Character((char) 192), KeyCode.BACK_QUOTE);
			charToKeyCodeMap.put(new Character((char) 222), KeyCode.QUOTE);
			charToKeyCodeMap.put(new Character((char) 224), KeyCode.KP_UP);
			charToKeyCodeMap.put(new Character((char) 225), KeyCode.KP_DOWN);
			charToKeyCodeMap.put(new Character((char) 226), KeyCode.KP_LEFT);
			charToKeyCodeMap.put(new Character((char) 227), KeyCode.KP_RIGHT);
			charToKeyCodeMap.put(new Character((char) 128), KeyCode.DEAD_GRAVE);
			charToKeyCodeMap.put(new Character((char) 129), KeyCode.DEAD_ACUTE);
			charToKeyCodeMap.put(new Character((char) 130),
					KeyCode.DEAD_CIRCUMFLEX);
			charToKeyCodeMap.put(new Character((char) 131), KeyCode.DEAD_TILDE);
			charToKeyCodeMap
					.put(new Character((char) 132), KeyCode.DEAD_MACRON);
			charToKeyCodeMap.put(new Character((char) 133), KeyCode.DEAD_BREVE);
			charToKeyCodeMap.put(new Character((char) 134),
					KeyCode.DEAD_ABOVEDOT);
			charToKeyCodeMap.put(new Character((char) 135),
					KeyCode.DEAD_DIAERESIS);
			charToKeyCodeMap.put(new Character((char) 136),
					KeyCode.DEAD_ABOVERING);
			charToKeyCodeMap.put(new Character((char) 137),
					KeyCode.DEAD_DOUBLEACUTE);
			charToKeyCodeMap.put(new Character((char) 138), KeyCode.DEAD_CARON);
			charToKeyCodeMap.put(new Character((char) 139),
					KeyCode.DEAD_CEDILLA);
			charToKeyCodeMap
					.put(new Character((char) 140), KeyCode.DEAD_OGONEK);
			charToKeyCodeMap.put(new Character((char) 141), KeyCode.DEAD_IOTA);
			charToKeyCodeMap.put(new Character((char) 142),
					KeyCode.DEAD_VOICED_SOUND);
			charToKeyCodeMap.put(new Character((char) 143),
					KeyCode.DEAD_SEMIVOICED_SOUND);
			charToKeyCodeMap.put(new Character((char) 150), KeyCode.AMPERSAND);
			charToKeyCodeMap.put(new Character((char) 151), KeyCode.ASTERISK);
			charToKeyCodeMap.put(new Character((char) 152), KeyCode.QUOTEDBL);
			charToKeyCodeMap.put(new Character((char) 153), KeyCode.LESS);
			charToKeyCodeMap.put(new Character((char) 160), KeyCode.GREATER);
			charToKeyCodeMap.put(new Character((char) 161), KeyCode.BRACELEFT);
			charToKeyCodeMap.put(new Character((char) 162), KeyCode.BRACERIGHT);
			charToKeyCodeMap.put(new Character((char) 512), KeyCode.AT);
			charToKeyCodeMap.put(new Character((char) 513), KeyCode.COLON);
			charToKeyCodeMap.put(new Character((char) 514), KeyCode.CIRCUMFLEX);
			charToKeyCodeMap.put(new Character((char) 515), KeyCode.DOLLAR);
			charToKeyCodeMap.put(new Character((char) 516), KeyCode.EURO_SIGN);
			charToKeyCodeMap.put(new Character((char) 517),
					KeyCode.EXCLAMATION_MARK);
			charToKeyCodeMap.put(new Character((char) 518),
					KeyCode.INVERTED_EXCLAMATION_MARK);
			charToKeyCodeMap.put(new Character((char) 519),
					KeyCode.LEFT_PARENTHESIS);
			charToKeyCodeMap
					.put(new Character((char) 520), KeyCode.NUMBER_SIGN);
			charToKeyCodeMap.put(new Character((char) 521), KeyCode.PLUS);
			charToKeyCodeMap.put(new Character((char) 522),
					KeyCode.RIGHT_PARENTHESIS);
			charToKeyCodeMap.put(new Character((char) 523), KeyCode.UNDERSCORE);
			charToKeyCodeMap.put(new Character((char) 524), KeyCode.WINDOWS);
			charToKeyCodeMap.put(new Character((char) 525),
					KeyCode.CONTEXT_MENU);
			charToKeyCodeMap.put(new Character((char) 24), KeyCode.FINAL);
			charToKeyCodeMap.put(new Character((char) 28), KeyCode.CONVERT);
			charToKeyCodeMap.put(new Character((char) 29), KeyCode.NONCONVERT);
			charToKeyCodeMap.put(new Character((char) 30), KeyCode.ACCEPT);
			charToKeyCodeMap.put(new Character((char) 31), KeyCode.MODECHANGE);
			charToKeyCodeMap.put(new Character((char) 21), KeyCode.KANA);
			charToKeyCodeMap.put(new Character((char) 25), KeyCode.KANJI);
			charToKeyCodeMap.put(new Character((char) 240),
					KeyCode.ALPHANUMERIC);
			charToKeyCodeMap.put(new Character((char) 241), KeyCode.KATAKANA);
			charToKeyCodeMap.put(new Character((char) 242), KeyCode.HIRAGANA);
			charToKeyCodeMap.put(new Character((char) 243), KeyCode.FULL_WIDTH);
			charToKeyCodeMap.put(new Character((char) 244), KeyCode.HALF_WIDTH);
			charToKeyCodeMap.put(new Character((char) 245),
					KeyCode.ROMAN_CHARACTERS);
			charToKeyCodeMap.put(new Character((char) 256),
					KeyCode.ALL_CANDIDATES);
			charToKeyCodeMap.put(new Character((char) 257),
					KeyCode.PREVIOUS_CANDIDATE);
			charToKeyCodeMap.put(new Character((char) 258), KeyCode.CODE_INPUT);
			charToKeyCodeMap.put(new Character((char) 259),
					KeyCode.JAPANESE_KATAKANA);
			charToKeyCodeMap.put(new Character((char) 260),
					KeyCode.JAPANESE_HIRAGANA);
			charToKeyCodeMap.put(new Character((char) 261),
					KeyCode.JAPANESE_ROMAN);
			charToKeyCodeMap.put(new Character((char) 262), KeyCode.KANA_LOCK);
			charToKeyCodeMap.put(new Character((char) 263),
					KeyCode.INPUT_METHOD_ON_OFF);
			charToKeyCodeMap.put(new Character((char) 65489), KeyCode.CUT);
			charToKeyCodeMap.put(new Character((char) 65485), KeyCode.COPY);
			charToKeyCodeMap.put(new Character((char) 65487), KeyCode.PASTE);
			charToKeyCodeMap.put(new Character((char) 65483), KeyCode.UNDO);
			charToKeyCodeMap.put(new Character((char) 65481), KeyCode.AGAIN);
			charToKeyCodeMap.put(new Character((char) 65488), KeyCode.FIND);
			charToKeyCodeMap.put(new Character((char) 65482), KeyCode.PROPS);
			charToKeyCodeMap.put(new Character((char) 65480), KeyCode.STOP);
			charToKeyCodeMap.put(new Character((char) 65312), KeyCode.COMPOSE);
			charToKeyCodeMap
					.put(new Character((char) 65406), KeyCode.ALT_GRAPH);
			charToKeyCodeMap.put(new Character((char) 65368), KeyCode.BEGIN);
			charToKeyCodeMap.put(new Character((char) 0), KeyCode.UNDEFINED);
			charToKeyCodeMap.put(new Character((char) 4096), KeyCode.SOFTKEY_0);
			charToKeyCodeMap.put(new Character((char) 4097), KeyCode.SOFTKEY_1);
			charToKeyCodeMap.put(new Character((char) 4098), KeyCode.SOFTKEY_2);
			charToKeyCodeMap.put(new Character((char) 4099), KeyCode.SOFTKEY_3);
			charToKeyCodeMap.put(new Character((char) 4100), KeyCode.SOFTKEY_4);
			charToKeyCodeMap.put(new Character((char) 4101), KeyCode.SOFTKEY_5);
			charToKeyCodeMap.put(new Character((char) 4102), KeyCode.SOFTKEY_6);
			charToKeyCodeMap.put(new Character((char) 4103), KeyCode.SOFTKEY_7);
			charToKeyCodeMap.put(new Character((char) 4104), KeyCode.SOFTKEY_8);
			charToKeyCodeMap.put(new Character((char) 4105), KeyCode.SOFTKEY_9);
			charToKeyCodeMap.put(new Character((char) 4106), KeyCode.GAME_A);
			charToKeyCodeMap.put(new Character((char) 4107), KeyCode.GAME_B);
			charToKeyCodeMap.put(new Character((char) 4108), KeyCode.GAME_C);
			charToKeyCodeMap.put(new Character((char) 4109), KeyCode.GAME_D);
			charToKeyCodeMap.put(new Character((char) 4110), KeyCode.STAR);
			charToKeyCodeMap.put(new Character((char) 4111), KeyCode.POUND);
			charToKeyCodeMap.put(new Character((char) 409), KeyCode.POWER);
			charToKeyCodeMap.put(new Character((char) 457), KeyCode.INFO);
			charToKeyCodeMap.put(new Character((char) 403),
					KeyCode.COLORED_KEY_0);
			charToKeyCodeMap.put(new Character((char) 404),
					KeyCode.COLORED_KEY_1);
			charToKeyCodeMap.put(new Character((char) 405),
					KeyCode.COLORED_KEY_2);
			charToKeyCodeMap.put(new Character((char) 406),
					KeyCode.COLORED_KEY_3);
			charToKeyCodeMap.put(new Character((char) 414),
					KeyCode.EJECT_TOGGLE);
			charToKeyCodeMap.put(new Character((char) 415), KeyCode.PLAY);
			charToKeyCodeMap.put(new Character((char) 416), KeyCode.RECORD);
			charToKeyCodeMap.put(new Character((char) 417), KeyCode.FAST_FWD);
			charToKeyCodeMap.put(new Character((char) 412), KeyCode.REWIND);
			charToKeyCodeMap.put(new Character((char) 424), KeyCode.TRACK_PREV);
			charToKeyCodeMap.put(new Character((char) 425), KeyCode.TRACK_NEXT);
			charToKeyCodeMap.put(new Character((char) 427), KeyCode.CHANNEL_UP);
			charToKeyCodeMap.put(new Character((char) 428),
					KeyCode.CHANNEL_DOWN);
			charToKeyCodeMap.put(new Character((char) 447), KeyCode.VOLUME_UP);
			charToKeyCodeMap
					.put(new Character((char) 448), KeyCode.VOLUME_DOWN);
			charToKeyCodeMap.put(new Character((char) 449), KeyCode.MUTE);
			charToKeyCodeMap.put(new Character((char) 768), KeyCode.COMMAND);
			charToKeyCodeMap.put(new Character((char) 65535), KeyCode.SHORTCUT);

		}
		// return charToKeyCodeMap;

	}

	public KeyCode getKeyCode(char c) {

		System.out.println(c);
		if (Character.isLetter(c)) {
			return charToKeyCodeMap.get(new Character((char) Character
					.toUpperCase((int) c)));
		} else {
			return charToKeyCodeMap.get(new Character(c));
		}

	}

}
