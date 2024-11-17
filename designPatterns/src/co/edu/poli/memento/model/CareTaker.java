package co.edu.poli.memento.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 */
public class CareTaker {

    /**
     * 
     */
    private int count;

    /**
     * 
     */
    private Map<Integer, Memento> mementoMap;

    /**
     * Default constructor
     */
    public CareTaker() {
    	mementoMap = new HashMap <Integer, Memento>();
    	count = 1;
    }

    /**
     * @param memento
     */
    public void addState(Memento memento) {
        mementoMap.put(count, memento);
        count++;
    }

    /**
     * @param idx
     */
    public void removeState(int idx) {
    	mementoMap.remove(idx);
    }

    /**
     * 
     */
    public String printAllSavedState() {
    	
    	String s ="";
    	
    	for (Entry<Integer, Memento> i : mementoMap.entrySet()) 
			s += i.getKey() + i.getValue().printMemento() + "\n";
    	
    	return s;
    	
    }
        

    /**
     * @param idx 
     * @return
     */
    public Memento getState(int idx) {
        return mementoMap.get(idx);
    }

}