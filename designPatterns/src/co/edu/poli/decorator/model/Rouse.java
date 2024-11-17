package co.edu.poli.decorator.model;

public class Rouse extends Bouquet {
	
	public Rouse() {
		super("RouseBouquet");
	}

	@Override
	public double cost() {
		return 150;
	}
}