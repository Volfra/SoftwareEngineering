package co.edu.poli.templatemethod.model;

public class PizzaHawaiana extends Pizza {
    // Implementación específica de agregarIngredientes para PizzaHawaiana
	@Override
    protected void agregarIngredientes() {
        System.out.println("Agregando jamón, piña y queso...");
    }
}
