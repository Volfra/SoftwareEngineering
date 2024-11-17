package edu.co.poli.withDI.model;

public class Cliente {

	public static void main(String[] args) {
	
		IPersistence miconexiocita = new MySQL();
		IPersistence o = new Oracle();
		
		MySQL m = new MySQL();
		
		ServicePerson  s1 = new ServicePerson(miconexiocita);

		ServicePerson  s2 = new ServicePerson(o);
				
	}

}
