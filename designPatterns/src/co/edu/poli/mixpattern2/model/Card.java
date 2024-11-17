package co.edu.poli.mixpattern2.model;

import java.util.LinkedList;
import java.util.List;

public class Card implements Component {

	private String serial;
	private double voltI;
	private double voltO;
	private List<Component> components;

	public Card(String serial, double voltI, double voltO) {
		this.serial = serial;
		this.voltI = voltI;
		this.voltO = voltO;
		components = new LinkedList<>();
	}

	@Override
	public void addComponent(Component cp) {
		components.add(cp);
	}

	@Override
	public String toString() {
		return "<" + this.serial + ":" + components + ">";
	}

	@Override
	public double calculateWasteEnergy() {
		double size = 0.0;

		for (Component cp : components)
			size = size + cp.calculateWasteEnergy();

		return size + (voltI / voltO);
	}

}
