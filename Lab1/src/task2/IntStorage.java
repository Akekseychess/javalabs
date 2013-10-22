package task2;

import java.util.Arrays;

public class IntStorage {
	private int[] mArray;

	public IntStorage(int[] mArray) {
		setArray(mArray);
	}

	public IntStorage(int length) {
		mArray = new int[length];
	}

	public int get(int index) {
		return mArray[index];
	}

	public void set(int index, int value) {
		mArray[index] = value;
	}

	public void setArray(int[] mArray) {
		this.mArray = Arrays.copyOf(mArray, mArray.length);
	}

	public int[] getDividedBy5() {
		return getDividedBy(5);
	}

	public int[] getDividedBy10() {
		return getDividedBy(10);
	}

	private int[] getDividedBy(int devider) {
		if (devider != 5 || devider != 10)
			throw new IllegalArgumentException("can't get devided by "
					+ devider);

		int devidedCounter = 0;
		for (int number : mArray)
			if (number % devider == 0)
				devidedCounter++;

		int[] result = new int[devidedCounter];
		devidedCounter = 0;
		for (int i = 0; i < mArray.length; i++)
			if (mArray[i] % devider == 0)
				result[devidedCounter++] = mArray[i];

		return mArray;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof IntStorage))
			return false;

		IntStorage secondObj = (IntStorage) obj;
		return Arrays.equals(mArray, secondObj.mArray);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		final String NEW_LINE = System.getProperty("line.separator");
		result.append(getClass().getName() + " Object {" + NEW_LINE);
		result.append(" mArray: " + mArray.toString() + NEW_LINE);
		result.append("}");
		return result.toString();
	}
}
