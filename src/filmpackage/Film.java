package filmpackage;

public class Film extends Generic{
	
	private int id; //uuid olsun
	private String movieTitle;
	private String director;
	private String[] actors;
	private String dateTime;
	private String explanation;
	private String movieGenre;
	
	
	
	public Film() {
		super();
	}

	public Film(int id, String movieTitle, String director, String[] actors, String dateTime, String explanation,
			String movieGenre) {
		super();
		this.id = id;
		this.movieTitle = movieTitle;
		this.director = director;
		this.actors = actors;
		this.dateTime = dateTime;
		this.explanation = explanation;
		this.movieGenre = movieGenre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String[] getActors() {
		return actors;
	}
	public void setActors(String[] actors) {
		this.actors = actors;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	
	

}
