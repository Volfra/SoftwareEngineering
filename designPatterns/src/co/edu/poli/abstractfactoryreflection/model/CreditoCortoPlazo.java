package co.edu.poli.abstractfactoryreflection.model;

public class CreditoCortoPlazo implements Credito {

	@Override
	public double calcularInteresEA() {
		return 0.03;
	}

}
