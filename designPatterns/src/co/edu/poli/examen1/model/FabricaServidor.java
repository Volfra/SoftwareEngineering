package co.edu.poli.examen1.model;

/**
 * 
 */
public class FabricaServidor implements Fabricante {

    /**
     * @param t 
     * @return
     */
    public Tarjeta crearTarjeta(String t) {
        if (t.equals("principal"))
        	return new Principal();
        else
        	if (t.equals("grafica"))
        		return new Grafica();
        return null;
    }

    /**
     * @param a 
     * @return
     */
    public Almacenamiento crearAlmacenamiento(String a) {
        if (a.equals("DD"))
        	return new DiscoDuro();
        else
        	if (a.equals("DES"))
        		return new EstadoSolido();
        return null;
    }

}