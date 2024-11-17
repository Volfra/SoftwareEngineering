package co.edu.poli.abstractfactory.model;

/**
 * 
 */
public class ComestibleFactoria extends AbstractFactory {

    /**
     * Default constructor
     */
    public ComestibleFactoria() {
    }

	@Override
	public Bebida consultarBebida(String tipoBebida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comestible consultarComestible(String tipoComestible) {
		
		
    	if (tipoComestible==null)
    		return null;
    	
    	if (tipoComestible.equalsIgnoreCase("Lacteo"))
    		return new Lacteo();
    	else if (tipoComestible.equalsIgnoreCase("Procesado"))
    		return new Procesado();
    	

		
		return null;
	}


}