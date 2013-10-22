package task2;

public class IntStorageTest {
	public static void main(String[] args) {
		int length = args.length;
		int[] mArray = new int[length];
		for (int i = 0; i < length; i++)
			mArray[i] = Integer.parseInt(args[i]);

		final IntStorage mArrayStorage = new IntStorage(mArray);
		final int[] devidedBy5 = mArrayStorage.getDividedBy5();
		for (int i = 0; i < devidedBy5.length; i++)
			System.out.print(devidedBy5[i] + " ");
		
		System.out.println();
		
		final int[] devidedBy10 = mArrayStorage.getDividedBy10();
		for (int i = 0; i < devidedBy10.length; i++)
			System.out.print(devidedBy10[i] + " ");
	}
}
