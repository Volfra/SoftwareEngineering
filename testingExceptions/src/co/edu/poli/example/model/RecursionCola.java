package co.edu.poli.example.model;

/**
 * 
 * @author wsoto
 *
 */
public class RecursionCola implements Funcion{

	@Override
	public int factorial(int n) {
		return factorial (n,1);
	}
	
	/**
	 * 
	 * @param n
	 * @param f
	 * @return
	 */
	private int factorial(int n, int f) {
		if (n==0) return f;
		else return factorial(n-1, f*n);
	}

	@Override
	public double pi (int alpha) {
		return pi (alpha,4);
	}
	
	private double pi(int alpha, double p) {
		if (alpha==0) return p;
		else return pi (alpha-1, p+(4*(Math.pow(-1, alpha))/(2*alpha + 1)));
	}

	@Override
	public double e(double x, int alpha) {
		return e (x, alpha, 1.0);
	}
	
	/**
	 * 
	 * @param x
	 * @param alpha
	 * @param ve
	 * @return
	 */
	private double e(double x, int alpha, double ve) {
		if (alpha==0) return ve;
		else return e (x, alpha-1, ve+(Math.pow(x, alpha))/(factorial(alpha)));
	}


	@Override
	public int sumArray(int[] A) {
		return sumArray(A, A.length-1, 0);
	}
	
	/**
	 * 
	 * @param A
	 * @param n
	 * @param s
	 * @return
	 */
	private int sumArray(int[] A, int n, int s) {
		if (n<0) return s;
		else return sumArray(A, n-1, s+A[n]);
	}

}
