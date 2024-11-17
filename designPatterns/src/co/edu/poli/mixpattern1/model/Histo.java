package co.edu.poli.mixpattern1.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Histo {

	 private int count;

	    /**
	     * 
	     */
	    private Map<Integer, Data> dataMap;

	    /**
	     * Default constructor
	     */
	    public Histo() {
	    	dataMap = new HashMap <Integer, Data>();
	    	count = 1;
	    }

	    /**
	     * @param memento
	     */
	    public void addState(Data data) {
	        dataMap.put(count, data);
	        count++;
	    }

	    /**
	     * @param idx
	     */
	    public void removeState(int idx) {
	    	dataMap.remove(idx);
	    }

	    /**
	     * 
	     */
	    public String printAllSavedState() {
	    	
	    	String s ="";
	    	
	    	for (Entry<Integer, Data> i : dataMap.entrySet()) 
				s += i.getKey() + i.getValue().printData() + "\n";
	    	
	    	return s;
	    	
	    }
	        

	    /**
	     * @param idx 
	     * @return
	     */
	    public Data getState(int idx) {
	        return dataMap.get(idx);
	    }

	
}


