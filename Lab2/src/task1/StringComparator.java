package task1;

import java.util.Arrays;

public class StringComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arrays.sort(args , new LengthStringComparator());
		for(String arg:args)
			System.out.println(arg + " " + arg.length());
	}
	

}
