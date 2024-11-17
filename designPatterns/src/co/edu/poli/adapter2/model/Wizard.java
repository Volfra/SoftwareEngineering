package co.edu.poli.adapter2.model;

public class Wizard implements PersonajeAdapter{
	
	public String castDestructionSpell() {
		return "Fireball is coming!!";
	}
	
	public String shield () {
		return "Wizard casted shild spell";
	}
	
	public String openPortal() {
		return "No need to run lets open a portal";
	}

	@Override
	public Knight attack() {
		return null;
	}

	@Override
	public Knight defend() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Knight escape() {
		// TODO Auto-generated method stub
		return null;
	}

}
