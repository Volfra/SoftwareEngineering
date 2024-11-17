package co.edu.poli.abstractfactoryreflection.model;

import java.lang.reflect.InvocationTargetException;

public class PortafolioImpl implements PortafolioFactoria {

	@Override
	public Cuenta crearCuenta(String choice) {
		try {
	    	Class<?> s = Class.forName(choice);
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

	@Override
	public Cheque crearCheque(String choice) {
		try {
	    	Class<?> s = Class.forName(choice);
	    	if (s.getInterfaces()[0].getSimpleName().equals("Cheque"))
	    		return (Cheque) s.getDeclaredConstructor().newInstance();
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
