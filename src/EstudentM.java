import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class EstudentM {
	public static void main(String[] args) {

		List<Estudent> estudent = new ArrayList<Estudent>();
		Estudent estud1 = new Estudent("Rosa", "García", 18, "POO", "22TE01", 8);
		Estudent estud2 = new Estudent("María ", "Peréz ", 20, " POO ", "22TE02 ", 8.5);
		Estudent estud3 = new Estudent("Petra ", "Hernandez ", 22, " POO ", "22TE03 ", 9);
		Estudent estud4 = new Estudent("Luis ", "Gomez ", 21, " POO ", "22TE04 ", 9.3);
		estudent.add(estud1);
		estudent.add(estud2);
		estudent.add(estud3);
		estudent.add(estud4);
		for (Estudent estud : estudent) {
			System.out.println(estud);
		}
//		System.out.println("Nombre del estudiente:" + estud1.getName() + "," + " Su apellido es:" + estud1.getApellido()
//				+ "," + " Edad:" + estud1.getEdad() + "," + " Pertenece al siguiente curso:" + estud1.getCurso() + ","
//				+ " Su identificador es:" + estud1.getId() + "," + " Obtuvo una nota de:" + estud1.getNota());
//		Estudent estud2 = new Estudent("María ", "Peréz ", 20, " POO ", "22TE02 ", 8.5);
//		System.out.println("Nombre del estudiente " + estud2.getName() + estud2.getApellido() + "Edad "
//				+ estud2.getEdad() + " Pertenece al siguiente curso " + estud2.getCurso() + "Su identificador es "
//				+ estud2.getId() + "Obtuvo una nota de " + estud2.getNota());
//		Estudent estud3 = new Estudent("Petra ", "Hernandez ", 22, " POO ", "22TE03 ", 9);
//		System.out.println("Nombre del estudiente " + estud3.getName() + estud3.getApellido() + "Edad "
//				+ estud3.getEdad() + " Pertenece al siguiente curso " + estud3.getCurso() + "Su identificador es "
//				+ estud3.getId() + "Obtuvo una nota de " + estud3.getNota());
//		Estudent estud4 = new Estudent("Luis ", "Gomez ", 21, " POO ", "22TE04 ", 9.3);
//		System.out.println("Nombre del estudiente " + estud4.getName() + estud4.getApellido() + "Edad "
//				+ estud4.getEdad() + " Pertenece al siguiente curso " + estud4.getCurso() + "Su identificador es "
//				+ estud4.getId() + "Obtuvo una nota de " + estud4.getNota());
//

		System.out.println("\n***Entrando al if***");
		int Estudent = 0;
		float nota = 0;
		try {
			Estudent = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
			nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota"));
			if (Estudent >= 18 && nota >= 8) {
				System.out.println("Estos alumnos son mayores de edad y sus notas son aprobatorias");
			} else {
				System.out.println("Los alumnos son menores de edad y sus notas son reprobatorias");

			}
		} catch (NumberFormatException exception) {
			System.out.println("No introdujo los datos correctos");
		}

		System.out.println("\n***Entrando al switch***");
		try {
			int notaalu = 0;
			notaalu = Integer.parseInt(JOptionPane.showInputDialog("Vuelve a introducir tu nota"));
			switch (notaalu) {
			case 9:
				System.out.println("Esta nota es sobresaliente");
				break;
			case 8:
				System.out.println("Esta nota es buena");
				break;
			case 7:
				System.out.println("Esta nota es suficiente");
				break;
			default:
				System.out.println("La nota esta fuera del rango");
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("No introdujo los datos correctos");

		}

		System.out.println("\n¿El alumno acredito el curso? " + estud1.acreditoCurso());
		try {
			nota = Float.parseFloat(JOptionPane.showInputDialog("Competencia por centecimas "));
			if (nota >= 70) {
				JOptionPane.showMessageDialog(null, "Competencia alcanzada");
			} else {
				JOptionPane.showMessageDialog(null, "No se tiene la competencia");
			}

		} catch (NumberFormatException e) {
			System.out.println("'nNo introdujo los datos correctos");

		}
	}

}
