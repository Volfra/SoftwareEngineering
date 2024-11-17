package co.edu.poli.template.model;

public class Cliente {

	public static void main(String[] args) {
	
		Funcion ite = new Iterativo();
		Funcion rec = new Recursivo();
		System.out.println(ite.nameClase() + " " + ite.coef(12, 8));
		System.out.println(rec.nameClase() + " " +rec.coef(12, 8));
		
	}
}
