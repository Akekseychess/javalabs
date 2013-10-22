package task2;

import java.util.Arrays;

public class IntArrayManipulator {
	private int[] mArray;
	public IntArrayManipulator(String[] args){
		int length = args.length;
		mArray = new int[length];
		for (int i = 0; i < length; i++)
			mArray[i] = Integer.parseInt(args[i]);
	}
	
	public IntArrayManipulator(int[] array){
		mArray = Arrays.copyOf(array, array.length);
	}
	
	public IntArrayManipulator getPositiveElementsAtStart(){
		int[] tmpArray = new int[mArray.length];
		int positveIndex = 0;
		int negativeIndex = getPositiveElementsNumber();
		
		for (int element:mArray){
			if (element >= 0)
				tmpArray[positveIndex++] = element;
			else
				tmpArray[negativeIndex++]=element;
		}
		return new IntArrayManipulator(tmpArray);
	}
	
	private int getPositiveElementsNumber(){
		int result = 0;
		for (int i =0; i < mArray.length; i++)
			if (mArray[i] >= 0)
				result++;
		return result;
	}
	
	@Override
	public String toString(){
		String result = "";
		for (int i =0; i < mArray.length; i++)
			result += mArray[i] + " ";
		return result;
	}
}
