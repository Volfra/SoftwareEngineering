package co.edu.poli.templatemethod.model;

public class Client {
	public static void main(String[] args) {
        // Crear una pizza hawaiana y una pizza pepperoni
        Pizza pizzaHawaiana = new PizzaHawaiana();
        Pizza pizzaPepperoni = new PizzaPepperoni();
        
        // Preparar las pizzas
        System.out.println("Preparando pizza hawaiana...");
        pizzaHawaiana.prepararPizza();
        
        
        
        System.out.println("\nPreparando pizza de pepperoni...");
        pizzaPepperoni.prepararPizza();
    }
}

