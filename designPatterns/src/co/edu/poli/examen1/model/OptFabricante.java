package co.edu.poli.examen1.model;

/**
 * Eliminar constructor por defecto.
 */
public class OptFabricante {

    /**
     * @param str 
     * @return
     */
    public Fabricante elegirEquipo(String str) {
    	if (str.equals("servidor"))
    		return new FabricaServidor();
    	else if (str.equals("portatil"))
    		return new FabricaPortatil();
        return null;
    }

}