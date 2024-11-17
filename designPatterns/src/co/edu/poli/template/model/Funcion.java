package co.edu.poli.template.model;

public abstract class Funcion {

	public final int coef (int n, int k) {
		return facto(n)/(facto(k)*facto(n-k));
	}
		
	public String nameClase() {
		return getClass().getSimpleName();
	}
	
	public abstract int facto (int n);
	
}
