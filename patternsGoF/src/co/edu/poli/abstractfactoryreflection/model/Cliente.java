package co.edu.poli.abstractfactoryreflection.model;

/**
 * 
 */
public class Cliente {

    public static void main(String [ ] args) {
    	
    	PortafolioFactoria p = FactoryCreator.getFactory(Properties.Portafolio.toString());
    	
    	System.out.println("*** Portafolio Viajero ***");
    	System.out.println(p.crearCuenta(Properties.CtaCorriente.toString()).getClass().getSimpleName()+" "+
    						p.crearCuenta(Properties.CtaCorriente.toString()).calcularInteres()+" "+
    						p.crearCheque(Properties.ChqViajero.toString()).getClass().getSimpleName()+" "+
    						p.crearCheque(Properties.ChqViajero.toString()).valorCheque());
    	
    	System.out.println("*** Portafolio Estudiante ***");
    	System.out.println(p.crearCuenta(Properties.CtaAhorro.toString()).getClass().getSimpleName()+" "+
    						p.crearCuenta(Properties.CtaAhorro.toString()).calcularInteres()+" "+
    						p.crearCheque(Properties.ChqPortador.toString()).getClass().getSimpleName()+" "+
    						p.crearCheque(Properties.ChqPortador.toString()).valorCheque());
    	
    	System.out.println("*** Portafolio Empresarial ***");
    	System.out.println(p.crearCuenta(Properties.CtaEmpresarial.toString()).getClass().getSimpleName()+" "+
    						p.crearCuenta(Properties.CtaEmpresarial.toString()).calcularInteres()+" "+
    						p.crearCheque(Properties.ChqCruzado.toString()).getClass().getSimpleName()+" "+
    						p.crearCheque(Properties.ChqCruzado.toString()).valorCheque());
    }

}