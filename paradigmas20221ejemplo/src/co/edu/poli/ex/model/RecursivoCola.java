package co.edu.poli.ex.model;

public class RecursivoCola implements Funcion{

	@Override
	public int factorial(int n) {
		return factorial (n, 1);
	}

	public int factorial (int n, int f) {
		if (n==0) return f;
		else return factorial (n-1, f*n);
	}
	
}
