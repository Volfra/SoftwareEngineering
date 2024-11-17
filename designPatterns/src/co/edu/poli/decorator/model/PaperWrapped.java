package co.edu.poli.decorator.model;

public class PaperWrapped extends AddOn {

	public PaperWrapped(Bouquet b) {
		super("PaperWrapped", b);
	}

	public double cost() {
		return b.cost() + 15;
	}

	public String getDescription() {
		return b.getDescription() + " with Paper Wrapped";
	}

}