package task1;

import java.util.Arrays;
/**
 *  @author Rostyslav Roshak
 */
public class StringStorage {
	private String[] mStringArray;

	/**
	 * Creates String Storage of specificated size
	 * @param size
	 * size of string storage
	 */
	public StringStorage(int size) {
		mStringArray = new String[size];
	}

	/**
	 * Creates String Storage from String Array
	 * @param mStringArray 
	 */
	public StringStorage(String[] mStringArray) {
		this.mStringArray = Arrays.copyOf(mStringArray, mStringArray.length);
	}
	
	public String get(int index) {
		return mStringArray[index];
	}

	public void set(int index, String value) {
		mStringArray[index] = value;
	}

	public void set(String[] mStringArray) {
		this.mStringArray = Arrays.copyOf(mStringArray, mStringArray.length);
	}

	public String getConcatedString() {
		StringBuilder result = new StringBuilder();

		int i;
		for (i = 0; i < mStringArray.length - 1; i++)
			result.append(mStringArray[i] + " ");
		if (i < mStringArray.length)
			result.append(mStringArray[i]);

		return result.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StringStorage)) 
			return false;
		
		StringStorage secondObj = (StringStorage) obj;
		return Arrays.equals(mStringArray, secondObj.mStringArray);
	}
	
	@Override
	public String toString() {
	    StringBuilder result = new StringBuilder();
	    final String NEW_LINE = System.getProperty("line.separator");
	    result.append(getClass().getName() + " Object {" + NEW_LINE);
	    result.append(" mStringArray: " + mStringArray.toString() + NEW_LINE);
	    result.append("}");
	    return result.toString();
	}

}
