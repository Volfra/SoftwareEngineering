package co.edu.poli.factory.model;

/**
 * 
 */
public class Cliente {


    /**
     * @param args
     */
    public static void main(String [ ] args) {
    	
    	BebidaFactoria empresa = new BebidaFactoria();
    	
    	Bebida b = empresa.consultarBebida("Cerveza");
    	
    	System.out.println("El impuesto es "+b.consultaImpuesto());
    	
    	b = empresa.consultarBebida("Gaseosa");
    	
    	System.out.println("El impuesto es "+b.consultaImpuesto());
    	
    }
        

}