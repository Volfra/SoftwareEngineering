package co.edu.poli.objectPool.model;

public class Giant {

	private static int counter = 1;

	private int id;

	public Giant() {
		id = counter++;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

}