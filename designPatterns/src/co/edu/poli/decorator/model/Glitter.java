package co.edu.poli.decorator.model;

public class Glitter extends AddOn {

	public Glitter(Bouquet b) {
		super("Glitter", b);
	}

	public double cost() {
		return b.cost() + 35.0;
	}

	public String getDescription() {
		return b.getDescription() + " with Glitter";
	}

}