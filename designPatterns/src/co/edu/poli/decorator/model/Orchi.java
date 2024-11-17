package co.edu.poli.decorator.model;

public class Orchi extends Bouquet {
	
	public Orchi() {
		super("OrchiBouquet");
	}

	@Override
	public double cost() {
		return 300;
	}
}