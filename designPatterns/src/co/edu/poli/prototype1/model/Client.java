package co.edu.poli.prototype1.model;

/**
 * Design Patterns: Basic Prototype
 * 
 * @author wsoto
 * @since 26.10.21
 */
public class Client {

	public static void main(String[] args) {

		Book b = new Book("ABC111", "Gabriel García Marquéz", 2010, "Oveja Negra", "La Hojarasca", new int[120]);
		System.out.println(b);

		Book cloneBook1 = (Book) b.cloneObj();

		cloneBook1.setISBN("XYZ999");
		cloneBook1.setYear(2021);
		System.out.println(cloneBook1);

	}

}
