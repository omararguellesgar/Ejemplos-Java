
public class metodosArgumentos {

	public void datosGenerales(String nombre, String apellidoPaterno, String apellidoMaterno, String curp,
			String nacionalidad) {
		System.out.printf("Hola " + nombre + apellidoPaterno + apellidoMaterno + " Tu curp es:" + curp
				+ " Tu nacionalidad es:" + nacionalidad);
	}

	public void imprimirInfo() {
		datosGenerales("Omar", " Arguelles", " Garcia", " AUGO95", " Mexicana");
	}

	public void materia(String nombreMateria) {
		System.out.println(" \nPertenece al curso: " + nombreMateria);
	}

	public void imprimirMateria() {
		materia("Programaciòn Orientada a Objetos");
	}
}
