package co.edu.poli.strategy.model;

//Contiene una referencia a una instancia de la interfaz Strategy. 
//Esta clase utiliza la estrategia seleccionada por el usuario para realizar el cálculo.

public class Context {
	
	private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
    
    //permite la modificación de la estrategia en tiempo de ejecución a través del método
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
