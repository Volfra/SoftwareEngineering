package co.edu.poli.mixpattern2.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Histo {

	private int count;

	private Map<Integer, Data> dataMap;

	public Histo() {
		dataMap = new HashMap<Integer, Data>();
		count = 1;
	}

	public void addState(Data data) {
		dataMap.put(count, data);
		count++;
	}

	public void removeState(int idx) {
		dataMap.remove(idx);
	}

	public String printAllSavedState() {

		String s = "";

		for (Entry<Integer, Data> i : dataMap.entrySet())
			s += i.getKey() + ">" + i.getValue().printData() + "\n";

		return s;

	}

	public Data getState(int idx) {
		return dataMap.get(idx);
	}

}
