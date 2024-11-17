package co.edu.poli.factoryreflection.model;

import java.lang.reflect.InvocationTargetException;

/**
 * 
 */
public class CuentaFactoria {

    /**
     * @return
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @throws SecurityException 
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     * @throws IllegalArgumentException 
     */
    public Cuenta getCuenta(String c)  {
		try {
	    	Class<?> s = Class.forName(c);
	    	if (s.getInterfaces()[0].getSimpleName().equals("Cuenta"))
	    		return (Cuenta) s.getDeclaredConstructor().newInstance();
	    	else
	    		return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

}