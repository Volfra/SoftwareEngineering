package co.edu.poli.mixpattern1.model;

/**
 * 
 */
public class Cliente {


    /**
     * @param args
     */
    public static void main(String [ ] args) {
    	

    	SensorFactoria empresa = new SensorFactoria();

    	Histo histoa = new Histo();
    	
    	Sensor a = empresa.crearSensor("Temperature");
    	
    	a.setState("312", 4.4, "Celsius");
    	histoa.addState(a.saveToData());
    	
    	a.setState("312", 8.8, "Celsius");
    	histoa.addState(a.saveToData());
    	
    	a.setState("312", 2.2, "Celsius");
    	histoa.addState(a.saveToData());

    	a.setState("312", 3.3, "Celsius");
    	histoa.addState(a.saveToData());
    	
    	a.restoreStateFromData(histoa.getState(2));
    	System.out.println(a.printState());
    	
    	System.out.println(histoa.printAllSavedState());
    	
    	Histo histob = new Histo();
    	    	
    	Sensor b = empresa.crearSensor("Pression");
    	
    	b.setState("121221", 34.6, "Pascal");
    	histob.addState(b.saveToData());
    	
    	b.setState("121221", 4.8, "Pascal");
    	b.setState("121221", 15.7, "Pascal");

    	b.setState("121221", 44.2, "Pascal");
    	histob.addState(b.saveToData());
    	
    	b.restoreStateFromData(histob.getState(1));
    	System.out.println(b.printState());
    	
    	System.out.println(histob.printAllSavedState());



    }
        

}