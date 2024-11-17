package co.edu.poli.example.model;

/**
 * Firmas con funciones
 * @author wsoto
 * @since 29/03/22
 */
public interface Funcion {
	
	/**
	 * Calcula el factorial
	 * @param n un numero > 0
	 * @return el factorial de n
	 */
	public int factorial (int n);
	
	/**
	 * Calcula aproximacion de pi
	 * @param alpha limite de la serie
	 * @return aproximacion de pi
	 */
	public double pi (int alpha);
	
	/**
	 * Calcula el exponencial neper
	 * @param x el valor del exponente
	 * @param alpha aproximacion de la serie
	 * @return aproximacion ex
	 */
	public double e (double x, int alpha);
	
	/**
	 * Suma los valores de un arreglo de enteros
	 * @param A el arreglo de enteros
	 * @return la suma de los valores del arreglo
	 * @throws Exception 
	 */
	public int sumArray (int[] A) throws Exception;
	
}
