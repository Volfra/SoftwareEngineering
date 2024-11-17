package co.edu.poli.strategy.model;

//Contiene un método llamado doOperation que será implementado por cada clase ConcreteStrategy. 
//Define una única operación matemática que se puede realizar.

public interface Strategy {
	
	 int doOperation(int num1, int num2);

}
	