package task1;

import java.util.Comparator;

public class LengthStringComparator implements Comparator<String>{
	@Override
	public int compare(String arg0, String arg1) {
		return arg0.length() - arg1.length();
	}
}
