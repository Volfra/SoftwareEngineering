package co.edu.poli.template.model;

public class Recursivo extends Funcion {

	@Override
	public int facto(int n) {
		if (n==0) return 1;
		else return n * facto(n-1);
	}

}
