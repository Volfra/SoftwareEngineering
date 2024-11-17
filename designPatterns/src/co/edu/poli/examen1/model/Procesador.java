package co.edu.poli.examen1.model;

/**
 * Eliminar constructor por defecto.
 */
public class Procesador {

    /**
     * 
     */
    public String serial;

    /**
     * 
     */
    public String marca;

    /**
     * 
     */
    public int tamMemoria;

    /**
     * 
     */
    public int nHilos;

	@Override
	public String toString() {
		return "Procesador [serial=" + serial + ", marca=" + marca + ", tamMemoria=" + tamMemoria + ", nHilos=" + nHilos
				+ "]";
	}
    
    

}