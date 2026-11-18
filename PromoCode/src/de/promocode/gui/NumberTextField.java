package de.promocode.gui;

import javafx.scene.control.TextField;

public class NumberTextField extends TextField {
	
	@Override
	public void replaceText(int start, int end, String text) {
		if (text.matches("[0-9]") || text == "") {
			super.replaceText(start, end, text);
		}
	}

	@Override
	public void replaceSelection(String text) {
		if (text.matches("[0-9]") || text == "") {
			super.replaceSelection(text);
		}
	}

	public Long getNumber() {
		long number = 0L;
		try {
			number = Long.parseLong(this.getText());
		} catch (NumberFormatException e) {
			number = 0L;
		}
		return number;
	}
}
