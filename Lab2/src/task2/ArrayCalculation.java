package task2;

public class ArrayCalculation {
	//1 -24 5 -68 9 0 3 0 -6 10 -7 9 0 -5 6
	public static void main(String[] args) {
		System.out.print(new IntArrayManipulator(args).
				getPositiveElementsAtStart());
	}
}
