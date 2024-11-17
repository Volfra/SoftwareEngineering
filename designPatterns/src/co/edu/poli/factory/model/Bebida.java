package co.edu.poli.factory.model;

/**
 * 
 */
public abstract class Bebida {

    /**
     * Default constructor
     */
    public Bebida() {
    }

    /**
     * 
     */
    public abstract double consultaImpuesto();

    /**
     * @return
     */
    public String consultaContenido() {
    	
        return "Impresion de Bebidas";
    }

}