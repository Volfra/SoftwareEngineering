package co.edu.poli.examen1.model;

/**
 * 
 */
public interface Almacenamiento {

    /**
     * Implementacion para DiscoDuro:
     * si es SATA retorna 3.3 sino retornar 5.6
     * 
     * Implementacion para EstadoSolido:
     * si es SATA retorna 0.9 sino retornar 3.2
     * @param interfaz 
     * @return
     */
    public double calcularVelLecEsc(String interfaz);

}