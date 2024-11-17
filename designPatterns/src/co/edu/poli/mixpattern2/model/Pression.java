package co.edu.poli.mixpattern2.model;

public class Pression extends Sensor {

	public Pression(double voltI, double voltO) {
		super();
		this.voltI = voltI;
		this.voltO = voltO;
	}

	@Override
	public double calcConversion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateWasteEnergy() {
		return voltI / voltO + 0.03;
	}

	@Override
	public void addComponent(Component cp) {
	}

	@Override
	public String toString() {
		return "Pression [voltI=" + voltI + ", voltO=" + voltO + "] " + printState();
	}
}