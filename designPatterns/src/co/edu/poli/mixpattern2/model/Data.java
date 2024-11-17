package co.edu.poli.mixpattern2.model;

public class Data {

	private String serial;

	private double value;

	private String unit;

	public Data(String serial, double value, String unit) {
		super();
		this.serial = serial;
		this.value = value;
		this.unit = unit;
	}

	public String getSerial() {
		return serial;
	}

	public double getValue() {
		return value;
	}

	public String getUnit() {
		return unit;
	}

	public String printData() {
		return "Current State [serial=" + serial + ", value=" + value + ", unit=" + unit + "]";
	}

}
