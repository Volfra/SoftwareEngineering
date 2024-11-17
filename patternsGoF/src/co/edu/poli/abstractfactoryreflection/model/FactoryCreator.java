package co.edu.poli.abstractfactoryreflection.model;

import java.lang.reflect.InvocationTargetException;

public class FactoryCreator {
	
	public static PortafolioFactoria getFactory(String choice) {
			try {
		    	Class<?> s = Class.forName(choice);
		    	if (s.getInterfaces()[0].getSimpleName().equals("PortafolioFactoria"))
		    		return (PortafolioFactoria) s.getDeclaredConstructor().newInstance();
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
