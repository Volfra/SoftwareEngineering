package co.edu.poli.testing.model;

/**
 * Esta clase sirve para...
 * @author wsoto
 * @since 26.10.22
 * 
 */
public class Function {
	
	/**
	 * Este metodo calcula el factorial
	 * @param n valor ingresado mayor a cero
	 * @return el factorial de n
	 */
	public int facto (int n) {
		
		assert n>=1 && n<=10: String.format("No cumple precondicion");
		
		int f=1;
		
		assert f==1 : String.format("Error 1");
		
		int i=1;
		
		assert i==1 : String.format("Error 2");
		
		while (i<=n) { 
			f*=i;
			i+=1;
		}
		
		assert i>=n : String.format("Error 3");
		
		assert f==1 || f==120 || f==720 || f==3628800  : String.format("No cumple poscondicion");
		
		return f;
	
	}
	
	

}
