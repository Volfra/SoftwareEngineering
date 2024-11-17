package co.edu.poli.example.model;

/**
 * 
 * @author wsoto
 *
 */
public class Iterativo implements Funcion {

	@Override
	public int factorial(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++)
			f *= i;
		return f;
	}

	@Override
	public double pi(int alpha) {
		double p = 0;
		for (int n = 0; n <= alpha; n++)
			p += (Math.pow(-1, n)) / (2 * n + 1);
		return 4 * p;
	}

	@Override
	public double e(double x, int alpha) {
		double e = 0;
		for (int n = 0; n <= alpha; n++)
			e += (Math.pow(x, n)) / (factorial(n));
		return e;
	}

	@Override
	public int sumArray(int[] A) throws Exception {
		int s = 0;
		try {
			for (int i = 0; i < A.length; i++) {
				if (A[i] < 0)
					throw new ValueException("Menor valor");
				s += A[i];
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage(), e);
		}
		return s;
	}

	public int lengthException(int A[]) throws Exception {
		int s = 0;
		try {
			for (int i = 0; i <= A.length; i++) 
				s += A[i];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new Exception("Indice fuera arreglo", e);
		}
		return s;
	}

	public int convertArr(char C[]) throws Exception {
		int A[] = new int[C.length];
		try {
			for (int i = 0; i < C.length; i++)
				A[i] = Integer.parseInt(String.valueOf(C[i]));
		} catch (NumberFormatException e) {
			throw new Exception("Error conversion caracter", e);
		}
		return sumArray(A);
	}

	public Estudiante operation() {
		return new Estudiante("12356", 18, "Me");
	}

}
