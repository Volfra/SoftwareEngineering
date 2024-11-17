package co.edu.poli.factory.model;

/**
 * 
 */
public class BebidaFactoria {

    /**
     * Default constructor
     */
    public BebidaFactoria() {
    }


    /**
     * @return
     */
    public Bebida consultarBebida(String tipoBebida) {
    	
    	if (tipoBebida==null)
    		return null;
    	
    	if (tipoBebida.equalsIgnoreCase("Gaseosa"))
    		return new Gaseosa();
    	else if (tipoBebida.equalsIgnoreCase("Cerveza"))
    		return new Cerveza();
    	
    	return null;
    	
    }

}