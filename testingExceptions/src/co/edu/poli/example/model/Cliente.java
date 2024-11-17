package co.edu.poli.example.model;

/**
 * 
 * @author wsoto
 *
 */
public class Cliente {

	/**
	 * Metodo main
	 * 
	 * @param args arreglo
	 * @throws Exception
	 */
	public static void main(String[] args) {

		Funcion i = new Iterativo();
		Funcion r = new Recursivo();
		Funcion rc = new RecursionCola();

		System.out.println(i.getClass().getSimpleName() + ":" + i.factorial(5));
		System.out.println(r.getClass().getSimpleName() + ":" + r.factorial(5));
		System.out.println(rc.getClass().getSimpleName() + ":" + rc.factorial(5));

		System.out.println(i.getClass().getSimpleName() + ":" + i.pi(13));
		System.out.println(r.getClass().getSimpleName() + ":" + r.pi(13));
		System.out.println(rc.getClass().getSimpleName() + ":" + rc.pi(13));

		System.out.println(i.getClass().getSimpleName() + ":" + i.e(2.3, 12));
		System.out.println(r.getClass().getSimpleName() + ":" + r.e(2.3, 12));
		System.out.println(rc.getClass().getSimpleName() + ":" + rc.e(2.3, 12));

		int[] A = { 1, 3, 6, -7 };
		try {
			System.out.println(i.getClass().getSimpleName() + ":" + i.sumArray(A));
		} catch (Exception e) {}

		try {
			System.out.println(r.getClass().getSimpleName() + ":" + r.sumArray(A));
		} catch (Exception e) {}

		try {
			System.out.println(rc.getClass().getSimpleName() + ":" + rc.sumArray(A));
		} catch (Exception e) {}
	}

}
