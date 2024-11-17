package co.edu.poli.abstractfactory.model;

/**
 * 
 */
public class BebidaFactoria extends AbstractFactory {

    /**
     * Default constructor
     */
    public BebidaFactoria() {
    }

	@Override
	public Bebida consultarBebida(String tipoBebida) {
			
    	if (tipoBebida==null)
    		return null;
    	
    	if (tipoBebida.equalsIgnoreCase("Gaseosa"))
    		return new Gaseosa();
    	else if (tipoBebida.equalsIgnoreCase("Cerveza"))
    		return new Cerveza();
    	
    	return null;

	}

	@Override
	public Comestible consultarComestible(String tipoComestible) {
		// TODO Auto-generated method stub
		return null;
	}



}