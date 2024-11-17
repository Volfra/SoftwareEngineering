package co.edu.poli.adapter2.model;

public class Client {
	public static void main (String[] args) {
		Knight k1 = new Knight();
		System.out.println("k1's Action");
		System.out.println(k1.attack());
		System.out.println(k1.defend());
		System.out.println(k1.escape());
		
		Wizard w1 = new Wizard();
		System.out.println("w1's Action");
		System.out.println(w1.attack());
		System.out.println(w1.defend());
		System.out.println(w1.escape());
		
		
	}
}
