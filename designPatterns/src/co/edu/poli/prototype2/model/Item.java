package co.edu.poli.prototype2.model;

public abstract class Item implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public abstract int goTo (int location);

}
