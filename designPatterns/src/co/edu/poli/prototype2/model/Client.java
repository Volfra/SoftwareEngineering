package co.edu.poli.prototype2.model;

/**
 * Design Patterns: Basic Prototype with interface Cloneable
 * 
 * @author wsoto
 * @since 26.10.21
 */
public class Client {

	public static void main(String[] args) {

		try {
			Book b = new Book("ABC111", "Gabriel García Marquéz", 2010, "Oveja Negra", "La Hojarasca", new int[120]);
			System.out.println(b);

			Book cloneBook1 = (Book) b.clone();

			cloneBook1.setISBN("XYZ999");
			cloneBook1.setYear(2021);
			System.out.println(cloneBook1);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
