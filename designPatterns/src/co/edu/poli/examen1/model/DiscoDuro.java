package co.edu.poli.examen1.model;

import java.util.*;

/**
 * Eliminar constructor por defecto.
 */
public class DiscoDuro implements Almacenamiento {

    /**
     * 
     */
    public List<Plato> platos;


    /**
     * Implementacion para DiscoDuro:
     * si es SATA retorna 3.3 sino retornar 5.6
     * 
     * Implementacion para EstadoSolido:
     * si es SATA retorna 0.9 sino retornar 3.2
     * @param interfaz 
     * @return
     */
    public double calcularVelLecEsc(String interfaz) {
        if (interfaz.equals("SATA"))
        	return 3.3;
        else
        	return 5.6;
    }


	@Override
	public String toString() {
		return "DiscoDuro [platos=" + platos + "]";
	}

    
}