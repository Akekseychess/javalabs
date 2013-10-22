package visitorPattern;

public class JSonLoader implements Loader{

	@Override
	public void load(Film f) {
		f.setName("jName");
		f.setDuration(100);
		f.setProducedBy("jProducedB");
		f.setCast(new String[]{"jActor1", "jActor2"});
	}

	@Override
	public void load(Song s) {
		s.setName("jName");
		s.setAuthor("jAuthor");
		s.setDuration(600);
	}
}
