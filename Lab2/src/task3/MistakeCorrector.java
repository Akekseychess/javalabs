package task3;

public class MistakeCorrector {

	private String text;

	public MistakeCorrector(final String text) {
		this.text = text;
	}

	public void correct() {
		text=text.replaceAll("pa", "po");
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return text;
	}
}
