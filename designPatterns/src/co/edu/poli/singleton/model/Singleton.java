package co.edu.poli.singleton.model;

public class Singleton {

	private static Singleton obj;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (obj == null)
			obj = new Singleton();
		return obj;
	}
	
	public String conn (String s) {
		return "Connecting: " + s;
	}

}
