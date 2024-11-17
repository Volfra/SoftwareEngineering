package co.edu.poli.example.model;

import java.util.Iterator;

/**
 * 
 * @author wsoto
 *
 */
public class Recursivo implements Funcion {

	@Override
    public int factorial(int n) {
    	if (n==0) return 1;
    	else return factorial(n-1) * n;
    }
    
	@Override
	public double pi(int alpha) {
		if (alpha==0) return 4.0;
		else return pi (alpha-1) +(4*(Math.pow(-1, alpha))/(2*alpha + 1));
	}

	@Override
	public double e(double x, int alpha) {
		if (alpha==0) return 1.0;
		else return e (x, alpha-1) + (Math.pow(x, alpha))/(factorial(alpha));
	}

	@Override
	public int sumArray(int[] A) {
		try {
		for (int i = 0; i < A.length; i++) {
			if (A[i]<0)
				throw new ValueException("Menor valor");
		}	
		return sumArray(A, A.length-1);
		} catch (ValueException e) {
			System.out.println(e);
			return -1;
		} catch (Throwable e) {
			System.out.println(e);
			return -1;
		}
	}

	/**
	 * 
	 * @param A
	 * @param n
	 * @return
	 */
	private int sumArray(int[] A, int n) {
		if (n==0) return A[n];
		else return sumArray(A, n-1) + A[n];
	}

}