package co.edu.poli.factoryreflection.view;

import co.edu.poli.factoryreflection.model.Cuenta;
import co.edu.poli.factoryreflection.model.CuentaFactoria;
import co.edu.poli.factoryreflection.model.TipoCuentas;

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