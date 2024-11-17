package co.edu.poli.abstractfactory.model;

/**
 * 
 */
public abstract class AbstractFactory {

    /**
     * Default constructor
     */
    public AbstractFactory() {
    }

    /**
     * @param tipoBebida 
     * @return
     */
    public abstract Bebida consultarBebida(String tipoBebida);

    /**
     * @param tipoComestible 
     * @return
     */
    public abstract Comestible consultarComestible(String tipoComestible);
}