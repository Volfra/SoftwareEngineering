package co.edu.poli.abstractfactory.model;

/**
 * 
 */
public class Cliente {

    /**
     * @param args
     */
    public static void main(String [ ] args) {
    	
    	AbstractFactory empresa = FactoriaCreador.traerFactoria("Comestible");
    	
    	Comestible producto = empresa.consultarComestible("Lacteo");
    	
    	System.out.println(producto.consultaLugar());
    	
    	producto = empresa.consultarComestible("Procesado");
    	
    	System.out.println(producto.consultaLugar());
    	
    	empresa = FactoriaCreador.traerFactoria("Bebida");
    	
    	Bebida producto1 = empresa.consultarBebida("Gaseosa");
    	
    	System.out.println(producto1.consultaImpuesto());
    	
    	
    	
    	
        // TODO implement here
    }

}