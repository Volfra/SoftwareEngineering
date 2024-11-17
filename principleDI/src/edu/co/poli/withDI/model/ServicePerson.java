package edu.co.poli.withDI.model;

public class ServicePerson {
	
	private IPersistence persistence;
	
	public ServicePerson(IPersistence persistence) {
		this.persistence = persistence;
	}

	public void savePerson(Person person) {
		persistence.save(person);
	}

}
