package task5;

public class CharSwap {

	private String text;

	public CharSwap(String text) {
		this.text = text;
	}

	public String swap(int i, int j) {
		if (i < 0 || j < 0 || i >= text.length() || j >= text.length()) {
			throw new IndexOutOfBoundsException();
		}
		if (i == j) {
			return text;
		}
		if (i < j) {
			return text.substring(0, i) + text.charAt(j)
					+ text.substring(i + 1, j) + text.charAt(i)
					+ text.substring(j + 1);
		} else {
			return text.substring(0, j) + text.charAt(i)
					+ text.substring(i + 1, i) + text.charAt(j)
					+ text.substring(i + 1);
		}
	}

}
