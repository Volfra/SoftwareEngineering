package co.edu.poli.examen2.model;

public class Knight implements Identity{
	
	@Override
    public String attack() {
        return "Knight attacks!!";
    }

	@Override
    public String defend() {
        return "Knight defends...";
    }

	@Override
    public String escape() {
        return "Run Knight run...";
    }

}
