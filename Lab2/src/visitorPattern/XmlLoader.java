package visitorPattern;

public class XmlLoader implements Loader{

	@Override
	public void load(Film f) {
		f.setName("xmlName");
		f.setDuration(300);
		f.setProducedBy("xmlProducedB");
		f.setCast(new String[]{"xmlActor1", "xmlActor2", "xmlActor5"});
	}

	@Override
	public void load(Song s) {
		s.setName("xmlName");
		s.setAuthor("xmlAuthor");
		s.setDuration(500);
	}
}
