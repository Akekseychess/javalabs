package task5;

public class CharSwap {
	public static void main(String[] args) {
		String text ="Hello world";
		StringBuilder swapedText = new StringBuilder();
		for (int i =text.length() -1; i >= 0 ; i--)
			swapedText.append(text.charAt(i));
		System.out.print(swapedText);
	}

}
