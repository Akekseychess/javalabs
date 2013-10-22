package task3;

public class MistakeCorrector {

	public static void main(String[] args) {
		String text = "pasdfsdf sdfpaSDFDSF sdfsdfpa";
		System.out.print(text.replaceAll("pa[^\b]", "po"));
	}
}
