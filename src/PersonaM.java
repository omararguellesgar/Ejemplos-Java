import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class PersonaM {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new LinkedList<Persona>();
		Persona persona1 = new Persona("Juan", "Palomino", "22TE01", 26, "Agricultor");
		Persona persona2 = new Persona("Rosa", "Isela", "22TE02", 20, "Empleada");
		Persona persona3 = new Persona("Angel", "Quezada", "22TE03", 18, "Comerciante");
		Persona persona4 = new Persona("Alfredo", "Vega", "22TE04", 19, "Empleado");
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);

		System.out.println("La lista esta vacia: " + listaPersonas.isEmpty());
		System.out.println("Tamaño de la lista: " + listaPersonas.size());
		for (Persona persona : listaPersonas) {
			System.out.println(persona);

		}
		int Persona = 20;
		if (Persona >= 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");

		}

		System.out.println("Esta persona esta en la posición del indice: " + listaPersonas.indexOf(persona4));
		System.out.println("Tiene el siguiente Id");
		System.out.println(persona4.getId());
		
		String oficio = "Comerciante";
		switch (oficio) {
		case "Agricultor":
			System.out.println("Su oficio es Agricultor");
			break;
		case "Empleada":
			System.out.println("Su oficio es Empleada");
			break;
		case "Comerciante":
			System.out.println("Su oficio es Comerciante");
			break;
		case "Empleado":
			System.out.println("Su oficio es Empleado");

		default:
			System.out.println("No aplica el caso para el oficio");
			break;
		}

	}

}
