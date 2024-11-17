package co.edu.poli.mixpattern2.model;

/**
 * Design Patterns: Factory + Memento + Composite
 * 
 * @author wsoto
 * @since 22.10.21
 */
public class Client {

	public static void main(String[] args) {

		SensorFactory empresa = new SensorFactory();

		Histo histoa = new Histo();

		Component c1 = new Card("Card1", 1.0, 1.0);

		Sensor sa = empresa.createSensor("Temperature", 2.3, 6.0);

		c1.addComponent(sa);

		sa.setState("312", 4.4, "Celsius");
		histoa.addState(sa.saveToData());

		sa.setState("312", 8.8, "Celsius");
		histoa.addState(sa.saveToData());

		sa.setState("312", 2.2, "Celsius");
		histoa.addState(sa.saveToData());

		sa.setState("312", 3.3, "Celsius");
		histoa.addState(sa.saveToData());

		sa.restoreStateFromData(histoa.getState(2));
		System.out.println(sa.printState());

		System.out.println(histoa.printAllSavedState());

		Histo histob = new Histo();

		Component c2 = new Card("Card2", 1.0, 1.0);

		Sensor sb = empresa.createSensor("Pression", 1.3, 5.8);

		c2.addComponent(sb);

		sb.setState("121221", 34.6, "Pascal");
		histob.addState(sb.saveToData());

		sb.setState("121221", 4.8, "Pascal");
		sb.setState("121221", 15.7, "Pascal");

		sb.setState("121221", 44.2, "Pascal");
		histob.addState(sb.saveToData());

		sb.restoreStateFromData(histob.getState(1));
		System.out.println(sb.printState());

		System.out.println(histob.printAllSavedState());

		Sensor sc = empresa.createSensor("Temperature", 3.2, 6.0);
		sc.setState("440", 323.1, "Kelvin");
		Sensor sd = empresa.createSensor("Temperature", 2.3, 5.6);
		sd.setState("820", 541.48, "Kelvin");
		c2.addComponent(sd);

		Component c3 = new Card("Card3", 1.0, 1.0);

		c3.addComponent(c1);
		c3.addComponent(c2);
		c3.addComponent(sc);

		System.out.println("Sensor A " + sa.getClass().getSimpleName() + ": " + sa.calculateWasteEnergy());
		System.out.println(c1.getClass().getSimpleName() + "1: " + c1.calculateWasteEnergy());

		System.out.println("Sensor B " + sb.getClass().getSimpleName() + ": " + sb.calculateWasteEnergy());
		System.out.println("Sensor D " + sd.getClass().getSimpleName() + ": " + sd.calculateWasteEnergy());
		System.out.println(c2.getClass().getSimpleName() + "2: " + c2.calculateWasteEnergy());

		System.out.println("Sensor C " + sc.getClass().getSimpleName() + ": " + sc.calculateWasteEnergy());
		System.out.println(c3.getClass().getSimpleName() + "3: " + c3.calculateWasteEnergy());

		System.out.println("Total Waste Energy Component: Card1+Card2+Sensor C+Card3");
		System.out.println(c3);

	}

}