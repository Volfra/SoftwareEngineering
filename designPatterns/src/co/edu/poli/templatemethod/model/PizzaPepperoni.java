package co.edu.poli.templatemethod.model;

public class PizzaPepperoni extends Pizza {
    // Implementación específica de agregarIngredientes para PizzaPepperoni
	@Override
    protected void agregarIngredientes() {
        System.out.println("Agregando pepperoni y queso...");
    }
}