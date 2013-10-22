package task4;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharCalc {
	public static void main(String[] args) {
		String text = "ddfffgsssfs";
		
		Map<Character, Integer> charCounter = countCharNumber(text);
		Iterator<Map.Entry<Character, Integer>> it = charCounter.entrySet().iterator();
		
		int maxValue = 0;
		while (it.hasNext()) {
	        Map.Entry<Character, Integer> pair = it.next();
	        if (maxValue < pair.getValue())
	        	maxValue = pair.getValue();
	    }
		
		it = charCounter.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Character, Integer> pair = it.next();
	        if (maxValue == pair.getValue())
	        	System.out.println(pair.getKey());
		}
	}
	
	
	private static Map<Character, Integer> countCharNumber(String text){
		Map<Character, Integer> charCounter = new HashMap<>();
		for (int i =0; i < text.length(); i++){
			char ch = text.charAt(i);
			Integer count = charCounter.get(ch);
			if (count == null)
				charCounter.put(ch, 1);
			else{
				count = count.intValue() + 1;
				charCounter.put(ch, count);
			}
		}
		return charCounter;
	}
}
