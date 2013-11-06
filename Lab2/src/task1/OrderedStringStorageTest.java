package task1;

public class OrderedStringStorageTest {

	public static void main(String[] args) {
		OrderedStringStorage storage = new OrderedStringStorage(args);
		String[] ordered_asc = storage.getOrderedByLength();
		String[] ordered_desc = storage.getOrderedByLengthDesc();

		System.out.println("UNORDERED");
		System.out.println(storage);

		System.out.println("\nORDERED ASCENDING");
		for (String s : ordered_asc) {
			System.out.println(s.length() + "\t" + s);
		}
		System.out.println("\nORDERED DESCENDING");
		for (String s : ordered_desc) {
			System.out.println(s.length() + "\t" + s);
		}
	}

}
