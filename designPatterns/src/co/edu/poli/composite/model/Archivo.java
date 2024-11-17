package co.edu.poli.composite.model;


/**
 * 
 */
public class Archivo implements Objeto {

	private Long size;
	private String tipo;
	
    public Archivo(Long size, String tipo) {
    	this.size = size;
    	this.tipo = tipo;
    }

    /**
     * @return
     */
    public Long getTamanio() {
        return size;
    }

    /**
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    
    public void adiObj(Objeto ob) {
    }

	@Override
	public String toString() {
		return "Archivo [size=" + size + ", tipo=" + tipo + "]";
	}
    
    
}