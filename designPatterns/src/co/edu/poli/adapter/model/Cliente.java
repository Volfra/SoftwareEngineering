package co.edu.poli.adapter.model;

public class Cliente {

	public static void main(String[] args) {

		// Class Adapter
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = sockAdapter.get3Volt();
		Volt v12 = sockAdapter.get12Volt();
		Volt v120 = sockAdapter.get120Volt();
		Volt v220 = sockAdapter.get220Volt();
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
		System.out.println("v220 volts using Class Adapter=" + v220.getVolts());
		System.out.println();
		
		// Object Adapter
		sockAdapter = new SocketObjectAdapterImpl();
		v3 = sockAdapter.get3Volt();
		v12 = sockAdapter.get12Volt();
		v120 = sockAdapter.get120Volt();
		v220 = sockAdapter.get220Volt();
		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
		System.out.println("v220 volts using Object Adapter=" + v220.getVolts());

	}

}