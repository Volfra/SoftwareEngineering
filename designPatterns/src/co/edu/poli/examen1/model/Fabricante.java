package co.edu.poli.examen1.model;

/**
 * 
 */
public interface Fabricante {

    /**
     * @param t 
     * @return
     */
    public Tarjeta crearTarjeta(String t);

    /**
     * @param a 
     * @return
     */
    public Almacenamiento crearAlmacenamiento(String a);

}