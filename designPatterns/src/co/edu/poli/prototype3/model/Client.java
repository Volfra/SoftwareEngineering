package co.edu.poli.prototype3.model;

/**
 * Design Patterns: Prototype with Prototype Registry
 * 
 * @author wsoto
 * @since 26.10.21
 */
public class Client {

	public static void main(String[] args) {

		ItemStore ps = new ItemStore();

		Book b = new Book("ABC111", "Gabriel García Marquéz", 2010, "Oveja Negra", "La Hojarasca", new int[120]);
		System.out.println(b);
		ps.addProduct(b.getClass().getSimpleName(), b);

		Movie m = new Movie("98765", "Martin Campbell", 2006, "MGM", "Casino Royale", "USA", new int[3358]);
		System.out.println(m);
		ps.addProduct(m.getClass().getSimpleName(), m);

		Book cloneBook1 = (Book) ps.getProduct("Book");
		cloneBook1.setISBN("XYZ999");
		cloneBook1.setYear(2021);
		System.out.println(cloneBook1);

		Movie cloneMovie1 = (Movie) ps.getProduct("Movie");
		cloneMovie1.setMovieid("56743");
		cloneMovie1.setTitle("The Pink Panther");
		cloneMovie1.setDirector("Shawn Levy");
		System.out.println(cloneMovie1);

	}

}
