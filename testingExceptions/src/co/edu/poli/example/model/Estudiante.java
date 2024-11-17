package co.edu.poli.example.model;

public class Estudiante {

	private String id;
	
	private int age;

	private String name;

	public Estudiante(String id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
