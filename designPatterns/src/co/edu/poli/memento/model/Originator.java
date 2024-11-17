package co.edu.poli.memento.model;

/**
 * 
 */
public class Originator {

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

    /**
     * @param temperature 
     * @param pression 
     * @param volume
     */
    public void setState(double temperature, double pression, double volume) {
        this.temperature = temperature;
        this.pression = pression;
        this.volume = volume;
    }

    /**
     * @return
     */
    public Memento saveToMemento() {
        return new Memento(temperature, pression, volume);
    }

    /**
     * @param memento
     */
    public void restoreStateFromMemento(Memento memento) {
        this.temperature = memento.getTemperature();
        this.pression = memento.getPression();
        this.volume = memento.getVolume();
    }

    /**
     * 
     */
    public String printState() {
		return "Current State [temperature=" + temperature + ", pression=" + pression + ", volume=" + volume + "]";
	}
    
    

}