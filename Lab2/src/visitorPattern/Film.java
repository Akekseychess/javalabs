package visitorPattern;

import java.util.Arrays;

public class Film implements Loadable {
	private String name;
	private String producedBy;
	private String[] cast;
	private int duration;
	public final static String UNKNOWN = "Unknown";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProducedBy() {
		return producedBy;
	}
	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = Arrays.copyOf(cast, cast.length);
	}
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Film(String name, String producedBy, String[] cast, int duration) {
		this.name = name;
		this.producedBy = producedBy;
		this.cast = Arrays.copyOf(cast, cast.length);
		this.duration = duration;
	}
	
	public Film(String name, String producedBy, int duration) {
		this(name, producedBy, new String[]{null},duration);
	}
	
	public Film(String name) {
		this(name, UNKNOWN, 0);
	}
	
	public Film(){
		this(UNKNOWN);
	}
	
	@Override
	public String toString() {
	    StringBuilder result = new StringBuilder();
	    final String NEW_LINE = System.getProperty("line.separator");
	    result.append(this.getClass().getName() + " Object {" + NEW_LINE);
	    result.append(" Name: " + name + NEW_LINE);
	    result.append(" Produced by " + producedBy + NEW_LINE);
	    result.append(" Cast: " + cast + NEW_LINE);
	    result.append(" Duration: " + duration + NEW_LINE);
	    result.append("}");
	    return result.toString();
	}
	
	@Override
	public void accept(Loader v) {
		v.load(this);
	}
}
