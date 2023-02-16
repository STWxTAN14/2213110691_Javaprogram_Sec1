
public class Movie {
	@SuppressWarnings("unused")
	private String id;
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private Director director;
	
	public Movie (String id, String name, Director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}
	public Movie() {
		this.id = "";
		this.name = "";
		director = null;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	@Override
	
	public String toString() {
		return id + name+ "Direct by "+director.toString();
	}
}
