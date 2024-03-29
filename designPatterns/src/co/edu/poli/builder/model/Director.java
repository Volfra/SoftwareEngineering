package co.edu.poli.builder.model;

public class Director {

	public House getHouse (String typeHouse) {
		
		House h;
		
		if (typeHouse.equals("h1")) {
			h = new House.Builder()
					.withType("apto")
					.withCeil(null)
					.withFloor(null)
					.withDoor(null)
					.withWindow(null)
					.withPool(null)
					.build();
			
			Garden g = new Garden();
			h.setGarden(g);
			
		} else {
			h = new House.Builder()
					.withType("house")
					.withCeil(null)
					.withWindow(null)
					.withGarden(null)
					.build();
		}
			
		return h;
	}
	
}
