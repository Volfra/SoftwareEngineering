package co.edu.poli.factoryReflection.view;

import co.edu.poli.factoryReflection.model.Cuenta;
import co.edu.poli.factoryReflection.model.CuentaFactoria;
import co.edu.poli.factoryReflection.model.TipoCuentas;

/**
 * 
 */
public class Cliente {

    public static void main(String [ ] args) {
    	
    	CuentaFactoria cf = new CuentaFactoria();	
    	
    	Cuenta c = cf.getCuenta(TipoCuentas.A.toString());
    	
    	System.out.println(c.getClass().getSimpleName()+" "+c.calcularInteres() +" " + c.deducirImpuesto());
    	
    	
    }

}