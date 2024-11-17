package edu.co.poli.withDI.model;

public class Oracle implements IPersistence{

	@Override
	public void save(Person person) {
		System.out.println("Save person ok Oracle");
		
	}

	
}
