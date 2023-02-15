
public class Fruteria {
	String nombre;
	String color;
	String tamaño;
	String forma;

	public Fruteria(String nombre, String color, String tamaño, String forma) {
		this.nombre = nombre;
		this.color = color;
		this.tamaño = tamaño;
		this.forma = forma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Fruteria [nombre=" + nombre + ", color=" + color + ", tamaño=" + tamaño + ", forma=" + forma + "]";
	}

}
