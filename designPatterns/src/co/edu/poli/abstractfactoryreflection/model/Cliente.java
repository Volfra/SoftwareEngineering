package co.edu.poli.abstractfactoryreflection.model;

/**
 * 
 */
public class Cliente {

    public static void main(String [ ] args) {
    	
    	PortafolioFactoria p = CreadorFactoria.getFactory(Rutas.Portafolio.toString());
    	
    	System.out.println("*** Portafolio Viajero ***");
    	Cuenta prodCuenta = (Cuenta) p.crearProducto(Rutas.CtaCorriente.toString());
    	Cheque prodCheque = (Cheque) p.crearProducto(Rutas.ChqViajero.toString());
    	Credito prodCredito = (Credito) p.crearProducto(Rutas.CrdCortoPlazo.toString());
    	System.out.println(prodCuenta.getClass().getSimpleName()+" "+
    						prodCuenta.calcularInteres()+" "+
    						prodCheque.getClass().getSimpleName()+" "+
    						prodCheque.valorCheque()+" "+
    						prodCredito.getClass().getSimpleName()+" "+
    						prodCredito.calcularInteresEA());
    	
    	System.out.println("*** Portafolio Estudiante ***");
    	prodCuenta = (Cuenta) p.crearProducto(Rutas.CtaAhorro.toString());
    	prodCheque = (Cheque) p.crearProducto(Rutas.ChqPortador.toString());
    	prodCredito = (Credito) p.crearProducto(Rutas.CrdLargoPLazo.toString());
    	System.out.println(prodCuenta.getClass().getSimpleName()+" "+
    						prodCuenta.calcularInteres()+" "+
    						prodCheque.getClass().getSimpleName()+" "+
    						prodCheque.valorCheque()+" "+
    						prodCredito.getClass().getSimpleName()+" "+
    						prodCredito.calcularInteresEA());
    	
    	System.out.println("*** Portafolio Empresarial ***");
    	prodCuenta = (Cuenta) p.crearProducto(Rutas.CtaEmpresarial.toString());
    	prodCheque = (Cheque) p.crearProducto(Rutas.ChqCruzado.toString());
    	prodCredito = (Credito) p.crearProducto(Rutas.CrdLargoPLazo.toString());
    	System.out.println(prodCuenta.getClass().getSimpleName()+" "+
							prodCuenta.calcularInteres()+" "+
							prodCheque.getClass().getSimpleName()+" "+
							prodCheque.valorCheque()+" "+
							prodCredito.getClass().getSimpleName()+" "+
    						prodCredito.calcularInteresEA());
    }

}