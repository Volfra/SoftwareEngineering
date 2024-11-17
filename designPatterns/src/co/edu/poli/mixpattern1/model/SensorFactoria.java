package co.edu.poli.mixpattern1.model;

/**
 * 
 */
public class SensorFactoria {

    /**
     * Default constructor
     */
    public SensorFactoria() {
    }


    /**
     * @return
     */
    public Sensor crearSensor (String tipoSensor) {
    	
    	if (tipoSensor==null)
    		return null;
    	
    	if (tipoSensor.equalsIgnoreCase("Temperature"))
    		return new Temperature();
    	else if (tipoSensor.equalsIgnoreCase("Pression"))
    		return new Pression();
    	
    	return null;
    	
    }

}