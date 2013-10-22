package visitorPattern;

public class VisitorTest {
	
	public static void main(String[] args) {
		Loadable[] list = new Loadable[]{
				new Song(),
				new Film(),
				new Song("some", "some")
		};
		
		System.out.println("====== JSON ========");
		Loader loader = new JSonLoader();
		
		for (Loadable l:list)
			l.accept(loader);
		
		for (Loadable l:list)
			System.out.println(l);
		
		System.out.println("====== XML ========");
		loader = new XmlLoader();
		
		for (Loadable l:list)
			l.accept(loader);
		
		for (Loadable l:list)
			System.out.println(l);
		
	}
}
