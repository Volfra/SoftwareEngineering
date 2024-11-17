package co.edu.poli.decorator.model;

public class RibbonBow extends AddOn {

	public RibbonBow(Bouquet b) {
		super("RibbonBow", b);
	}

	@Override
	public double cost() {
		return b.cost() + 25;
	}
	
	@Override
	public String getDescription() {
		return b.getDescription() + " with Ribbon Bow";
	}

}