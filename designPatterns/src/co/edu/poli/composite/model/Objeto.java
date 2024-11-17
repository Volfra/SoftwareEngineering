package co.edu.poli.composite.model;

/**
 * 
 */
public interface Objeto {


    /**
     * @return
     */
    public Long getTamanio();

    /**
     * @return
     */
    public String getTipo();
    
    
    public void adiObj(Objeto ob);

}