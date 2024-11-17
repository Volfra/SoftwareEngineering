package co.edu.poli.mixpattern2.model;

public abstract class Sensor implements Component {

	private String serial;
	private double value;
	private String unit;
	protected double voltI;
	protected double voltO;

	public void setState(String serial, double value, String unit) {
		this.serial = serial;
		this.value = value;
		this.unit = unit;
	}

	public Data saveToData() {
		return new Data(serial, value, unit);
	}

	public void restoreStateFromData(Data data) {
		this.serial = data.getSerial();
		this.value = data.getValue();
		this.unit = data.getUnit();
	}

	public String printState() {
		return "Current State [serial=" + serial + ", value=" + value + ", unit=" + unit + "]";
	}

	public abstract double calcConversion();

}