package co.edu.poli.memento.model;

/**
 * 
 */
public class Memento {

    /**
     * 
     */
    private double temperature;

    /**
     * 
     */
    private double pression;

    /**
     * 
     */
    private double volume;

    public Memento(double temperature, double pression, double volume) {
		super();
		this.temperature = temperature;
		this.pression = pression;
		this.volume = volume;
	}

	/**
     * @return
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @return
     */
    public double getPression() {
        return pression;
    }

    /**
     * @return
     */
    public double getVolume() {
        return volume;
    }

    /**
     * 
     */
    public String printMemento() {
   		return " State [temperature=" + temperature + ", pression=" + pression + ", volume=" + volume + "]";
	}

    
}