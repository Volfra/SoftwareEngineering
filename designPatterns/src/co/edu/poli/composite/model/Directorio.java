package co.edu.poli.composite.model;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 */
public class Directorio implements Objeto {
	
	private Long size;
	private List<Objeto> objetos;
	private String tipo;

	public Directorio(Long size, String tipo) {
		this.size = size;
		objetos = new LinkedList<>();
		this.tipo  = tipo;
	}

	/**
	 * @param ob
	 */
	public void adiObj(Objeto ob) {
		objetos.add(ob);
	}

	/**
	 * @return
	 */
	public Long getTamanio() {

		Long size = 0L;

		for (Objeto obj : objetos)
			size = size + obj.getTamanio();

		return size;
	}

	/**
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "<" + objetos + ">";
	}

}