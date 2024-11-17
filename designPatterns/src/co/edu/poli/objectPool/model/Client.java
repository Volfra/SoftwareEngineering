package co.edu.poli.objectPool.model;

public class Client {
	
	public static void main(String[] args) {
		
		GiantPool pool = new GiantPool();
		Giant g1 = pool.checkOut();
		System.out.println("created "+ g1.getId() +" "+ g1);
		System.out.println(pool);
		Giant g2 = pool.checkOut();
		System.out.println("created "+ g2.getId() +" "+ g2);
		System.out.println(pool);
		Giant g3 = pool.checkOut();
		System.out.println("created "+ g3.getId() +" "+ g3);
		System.out.println(pool);
		pool.checkIn(g1);
		System.out.println("Insert at pool "+ g1.getId() +" "+ g1);
		System.out.println(pool);
		Giant g4 = pool.checkOut();
		System.out.println("created "+ g4.getId() +" "+ g4);
		System.out.println(pool);
		pool.checkIn(g2);
		System.out.println("Insert at pool "+ g2.getId() +" "+ g2);
		System.out.println(pool);
		Giant g5 = pool.checkOut();
		System.out.println("Extract object of the pool "+ g5.getId() +" "+ g5);
		System.out.println(pool);
		
	}

}
