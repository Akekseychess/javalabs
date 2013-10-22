package visitorPattern;

public class Song implements Loadable{
	private String name;
	private String author;
	private int duration;
	public final static String UNKNOWN = "Unknown";
	
	public Song(String name, String author, int duration) {
		this.name = name;
		this.author = author;
		this.duration = duration;
	}
	
	public Song(String name, String author) {
		this(name, author, 0);
	}
	
	public Song(String name) {
		this(name, UNKNOWN, 0);
	}
	
	public Song( ) {
		this(UNKNOWN, UNKNOWN, 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
	    StringBuilder result = new StringBuilder();
	    final String NEW_LINE = System.getProperty("line.separator");
	    result.append(this.getClass().getName() + " Object {" + NEW_LINE);
	    result.append(" Name: " + name + NEW_LINE);
	    result.append(" Author: " + author + NEW_LINE);
	    result.append(" Duration: " + duration + NEW_LINE);
	    result.append("}");
	    return result.toString();
	}

	@Override
	public void accept(Loader v) {
		v.load(this);
	}
}
