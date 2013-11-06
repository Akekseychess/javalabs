package task2;

public class ArrayManipulatorTest {
	
	public static void main(String[] args) {
		int[] data = {1, 0, -2, 5, 0, 8, 2, -6, -1, -4, 0, 4, 5, 2};
		ArrayManipulator am = new ArrayManipulator(data);
		System.out.println("Initial");
		System.out.println(am.toString());
		System.out.println("\nEven mult");
		System.out.println(am.getEvenPositionsMultiplication());
		System.out.println("\nSum zeroes");
		System.out.println(am.getSumBetweenZeroes());
		System.out.println("\nReordered");
		System.out.println(new ArrayManipulator(am.getPositiveElementsAtStart()));
	}
}
