package co.edu.poli.abstractfactoryreflection.model;

public interface PortafolioFactoria {
	
    /**
     * @return
     */
    public Cuenta crearCuenta(String choice);

    /**
     * @return
     */
    public Cheque crearCheque(String choice);
    


}
