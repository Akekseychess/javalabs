package task4;

public class CharCalcTest {

	public static void main(String[] args) {
		
		String text = "ddfffgsssfs";
		CharCalc cCalc = new CharCalc(text);
		Character[] chars = cCalc.getChars();
		int maxFreq = cCalc.getMaxFrequency();
		for(int i=0; i<chars.length; i++) {
			if(cCalc.getFrequency(chars[i])==maxFreq) {
				System.out.println(chars[i]);
			}
		}
	}

}
