package co.edu.poli.mixpattern2.model;

public class SensorFactory {

	public Sensor createSensor(String kindSensor, double voltI, double voltO) {

		if (kindSensor == null)
			return null;

		if (kindSensor.equalsIgnoreCase("Temperature"))
			return new Temperature(voltI, voltO);
		else if (kindSensor.equalsIgnoreCase("Pression"))
			return new Pression(voltI, voltO);

		return null;

	}

}