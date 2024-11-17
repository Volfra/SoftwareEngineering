package co.edu.poli.prototype3.model;

public class Movie extends Item {

	private String movieid;

	private String director;

	private int year;

	private String producer;

	private String title;

	private String country;
	
	private int[] numFrames;

	public Movie(String movieid, String director, int year, String product, String title, String country, int[] numFrames) {
		super();
		this.movieid = movieid;
		this.director = director;
		this.year = year;
		this.producer = product;
		this.title = title;
		this.country = country;
		this.setNumFrames(numFrames);
	}

	public String getMovieid() {
		return movieid;
	}

	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String product) {
		this.producer = product;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCountry() {
		return country;
	}

	public void setBudget(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", author=" + director + ", yearPublish=" + year + ", producer=" + producer
				+ ", title=" + title + ", country=" + country + ", numFrames="+ numFrames.length +"]";
	}

	public int[] getNumFrames() {
		return numFrames;
	}

	public void setNumFrames(int[] numFrames) {
		this.numFrames = numFrames;
	}

	@Override
	public int goTo(int location) {
		return numFrames[location];
	}

}
