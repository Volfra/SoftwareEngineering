package co.edu.poli.mediator.model;

public class ConcreteMediator implements Mediator {

	@Override
	public String showMsg(String msg, Component c) {
		return c.getName() + "'gets message: " + msg;
	}

}
