
public class Persona {
	String name;
	String apellido;
	String id;
	int edad;
	String oficio;

	public Persona(String name, String apellido, String id, int edad, String oficio) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.id = id;
		this.edad = edad;
		this.oficio = oficio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", apellido=" + apellido + ", id=" + id + ", edad=" + edad + ", oficio="
				+ oficio + "]";
	}

}
