
public class Estudent {

	String name;
	String apellido;
	int edad;
	String curso;
	String id;
	double nota;

	public Estudent(String name, String apellido, int edad, String curso, String id, double nota) {
		this.name = name;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
		this.id = id;
		this.nota = nota;
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

	public void setApellidos(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public void imprimirInfo() {
		System.out.println("El nombre es: " + name);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("Pertenece al curso: " + curso);
		System.out.println("Su id es: " + id);
		System.out.println("Su nota: " + nota);

	}

	boolean acreditoCurso() {
		return true;
	}

	@Override
	public String toString() {
		return "Estudent name= " + name + ", apellido= " + apellido + ", edad= " + edad + ", curso= " + curso + ", id= "
				+ id + ", nota= " + nota + "";
	}

}
