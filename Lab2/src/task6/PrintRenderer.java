package task6;

public class PrintRenderer {

	public void renderRectangle(Rectangle r) {
		for (int i = 0; i < r.getH(); i++) {
			for (int j = 0; j < r.getW(); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
