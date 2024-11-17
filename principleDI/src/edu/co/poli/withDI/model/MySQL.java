package edu.co.poli.withDI.model;

public class MySQL implements IPersistence {

	@Override
	public void save(Person person) {
		System.out.println("Save person ok Mysql");

	}
	
	int method1() {
		return 3;
	}
	
}