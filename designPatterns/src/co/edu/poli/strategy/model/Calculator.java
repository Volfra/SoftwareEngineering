package co.edu.poli.strategy.model;

// utilizar las clases definidas anteriormente para crear una calculadora que permita a los usuarios realizar diferentes operaciones matemáticas. 
//Aquiutilizamos la clase Context para realizar una suma, resta, multiplicación y división.

public class Calculator {
	
	public static void main(String[] args) {
		
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    
        context.setStrategy(new OperationDivide());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
    }

}
