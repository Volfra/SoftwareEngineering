package co.edu.poli.examen1.model;

/**
 * Eliminar constructor por defecto.
 * 
 * Debido a la herencia de la clase abstracta Tarjeta el metodo calcularPotencia sale un error al exportar a Java. Por lo tanto, implemente el metodo y ya esta.
 * 
 * En el metodo calcularPotencia de esta clase se debe retornar  7.6
 */
public class Principal extends Tarjeta {

    /**
     * @return
     */
    public double calcularPotencia() {
    	return 7.6;
    }

}