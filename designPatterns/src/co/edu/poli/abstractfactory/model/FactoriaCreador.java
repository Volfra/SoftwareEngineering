package co.edu.poli.abstractfactory.model;

/**
 * 
 */
public class FactoriaCreador {

    /**
     * Default constructor
     */
    public FactoriaCreador() {
    }


    /**
     * @param eleccion 
     * @return
     */
    public static AbstractFactory traerFactoria(String eleccion) {
        
    	if (eleccion.equalsIgnoreCase("Bebida"))
    		return new BebidaFactoria();
    		else if (eleccion.equalsIgnoreCase("Comestible"))
    			return new ComestibleFactoria();
        return null;
    }

}