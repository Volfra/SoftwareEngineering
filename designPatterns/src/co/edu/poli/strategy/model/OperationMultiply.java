package co.edu.poli.strategy.model;

//Clase ConcreteStrategy que proporciona una implementación diferente de una operación matemática específica.

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}