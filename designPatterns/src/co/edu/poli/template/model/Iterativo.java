package co.edu.poli.template.model;

public class Iterativo extends Funcion{

	@Override
	public int facto(int n) {
		int f = 1;
		for (int i=1; i<=n; i++)
			f*=i;
		return f;
	}	

}
