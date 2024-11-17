package co.edu.poli.examen2.model;

public class WizardAdapter extends Wizard implements Identity {

	@Override
	public String attack() {
		return castDestructionSpell();
	}

	@Override
	public String defend() {
		return shield();
	}

	@Override
	public String escape() {
		return openPortal();
	}

}
