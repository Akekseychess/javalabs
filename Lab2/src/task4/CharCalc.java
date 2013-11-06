package task4;

import java.util.ArrayList;
import java.util.List;

public class CharCalc {

	private String text;

	public CharCalc(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Character[] getChars() {
		List<Character> chars = new ArrayList<Character>();
		for (int i = 0; i < text.length(); i++) {
			if (!chars.contains(text.charAt(i))) {
				chars.add(text.charAt(i));
			}
		}
		Character[] result = new Character[chars.size()];
		chars.toArray(result);
		return result;
	}

	public int getFrequency(char c) {
		int freq = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				freq++;
			}
		}
		return freq;
	}

	public int getMaxFrequency() {
		Character[] chars = this.getChars();
		int freq = 0;
		for (Character c : chars) {
			if (getFrequency(c) > freq) {
				freq = getFrequency(c);
			}
		}
		return freq;
	}

}
