package co.edu.poli.examen1.model;

/**
 * Eliminar constructor por defecto.
 * 
 * Debido a la herencia de la clase abstracta Tarjeta el metodo calcularPotencia sale un error al exportar a Java. Por lo tanto, implemente el metodo y ya esta.
 * 
 * En el metodo calcularPotencia de esta clase se debe retornar 3.4
 */
public class Grafica extends Tarjeta {

    /**
     * Este método se calcula:
     * (interfazMem * frecEfecMem) / 8
     * @param interfazMem 
     * @param frecEfecMem 
     * @return
     */
    public double calcularAB(double interfazMem, double frecEfecMem) {
        return (interfazMem * frecEfecMem) / 8;
    }

    /**
     * @return
     */
    public double calcularPotencia() {
    	return 3.4;
    }

	@Override
	public String toString() {
		return "Grafica [serial=" + serial + ", marca=" + marca + ", procesadores=" + procesadores + "]";
	}
    
    

}