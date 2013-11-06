package task3;

public class MistakeCorrectorTest {

	public static void main(String[] args) {
		MistakeCorrector c = new MistakeCorrector("padkin asd thupa pofjkl papa papopap");
		System.out.println(c);
		c.correct();
		System.out.println(c);
	}
}
