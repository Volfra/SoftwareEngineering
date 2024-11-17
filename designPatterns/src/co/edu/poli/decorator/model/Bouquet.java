package co.edu.poli.decorator.model;

public abstract class Bouquet {

	private String description;

	public Bouquet(String description) {
		this.description = description;
	}

	public abstract double cost();

	public String getDescription() {
		return description;
	}

}