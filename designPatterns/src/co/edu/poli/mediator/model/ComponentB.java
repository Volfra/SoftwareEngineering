package co.edu.poli.mediator.model;

public class ComponentB extends Component {

	private String name;
	private ConcreteMediator concreteMediator;

	@Override
	public String sendMsg(String msg, Component c) {
		return concreteMediator.showMsg(msg, c);
	}

	@Override
	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public ComponentB(ConcreteMediator concreteMediator) {
		this.concreteMediator = concreteMediator;
	}

}
