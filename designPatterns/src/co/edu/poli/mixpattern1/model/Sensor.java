package co.edu.poli.mixpattern1.model;

/**
 * 
 */
public abstract class Sensor {


    /**
     * 
     */
    private String serial;

    /**
     * 
     */
    private double value;

    /**
     * 
     */
    private String unit;



    /**
     * @param temperature 
     * @param pression 
     * @param volume
     */
    public void setState(String serial, double value, String unit) {
        this.serial = serial;
        this.value = value;
        this.unit = unit;
    }
    
    /**
     * @return
     */
    public Data saveToData() {
        return new Data(serial, value, unit);
    }

    /**
     * @param memento
     */
    public void restoreStateFromData(Data data) {
        this.serial = data.getSerial();
        this.value = data.getValue();
        this.unit = data.getUnit();
    }

    /**
     * 
     */
    public String printState() {
		return "Current State [serial=" + serial + ", value=" + value + ", unit=" + unit + "]";
	}
    

    /**
     * 
     */
    public abstract double calcConversion();

    /**
     * @return
     */
    public String consultaContenido() {
    	
        return "Huawei";
    }

}