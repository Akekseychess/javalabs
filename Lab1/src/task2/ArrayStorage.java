package task2;

import java.util.Arrays;

public class ArrayStorage {
	int[] mArray;
	
	public ArrayStorage(int[] mArray){
		setArray(mArray);
	}
	
	public void setArray(int[] mArray){
		this.mArray = Arrays.copyOf(mArray, mArray.length);
	}
	
	public int[] getDividedBy5or10(){
		int devidedBy5Or10Counter = 0;
		for(int number:mArray)
			if (taskCondition(number))
				devidedBy5Or10Counter ++;
		
		int[] result = new int[devidedBy5Or10Counter];
		devidedBy5Or10Counter = 0;
		for(int i = 0; i < mArray.length; i++)
			if (taskCondition(mArray[i]))
				result[devidedBy5Or10Counter++] = mArray[i];
		
		return mArray;
	}

	public void setArray(String[] mStringArray){
		
	}
	
	private boolean taskCondition(int number){
		if (number % 5 == 0)
			return true;
		return false;
	}
}
