package co.edu.poli.examen1.model;

import java.util.*;

/**
 * Eliminar constructor por defecto.
 */
public abstract class Tarjeta {

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
    public List <Procesador> procesadores;


    /**
     * @return
     */
    public abstract double calcularPotencia();

}