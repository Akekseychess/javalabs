package task1;

import java.util.Arrays;

public class StringStorage {
	private String[] mStringArray;

	public StringStorage(String[] mStringArray) {
		set(mStringArray);
	}
	
	public String get(){
		StringBuilder result =  new StringBuilder();
		
		int i;
		for (i = 0; i < mStringArray.length -1; i++)
			result.append(mStringArray[i] + " ");
		if (i < mStringArray.length)
			result.append(mStringArray[i]);
		
		return result.toString();
	}
	
	public void set(String[] mStringArray){
		this.mStringArray = Arrays.copyOf(mStringArray, mStringArray.length);
	}
}
