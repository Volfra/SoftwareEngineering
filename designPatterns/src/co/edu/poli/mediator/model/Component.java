package co.edu.poli.mediator.model;

public abstract class Component {

	public abstract String sendMsg(String msg, Component c);

	public abstract void setname(String name);

	public abstract String getName();

}
