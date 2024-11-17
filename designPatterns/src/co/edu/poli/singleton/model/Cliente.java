package co.edu.poli.singleton.model;


public class Cliente {
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s1.conn("user1 : ") + s1);
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s2.conn("user2 : ") + s2);

		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s3.conn("user3 : ") + s3);
		/* 
		 * Singleton example with MySQL
		 * https://www.geeksforgeeks.org/jdbc-using-model-object-and-singleton-class/
		 */

	}

}
