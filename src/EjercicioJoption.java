import javax.swing.JOptionPane;

public class EjercicioJoption {

	public static void main(String[] args) {
		int dia, mes, año;
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el día"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
		año = Integer.parseInt(JOptionPane.showInputDialog("Digita el año"));
		if (dia > 1 && dia <= 30) {
			System.out.println("El dia ingresado al calendario es correcto");
			JOptionPane.showMessageDialog(null, "El dia es muy importante...");
			if (mes > 1 && mes <= 12) {
				System.out.println("El mes que ingresaste al calendario es correcto");
				JOptionPane.showInternalMessageDialog(null, "El mes es el adecuado y un buen mes");
				if (año > 0) {
					System.out.println("El año es valido para el calendario");
					JOptionPane.showInternalMessageDialog(null, "El año es correcto y ya vamos por el segundo");

				}
			}

		} else {
			JOptionPane.showMessageDialog(null, "Fecha incorrecta no existe ese dia en el calendario");
			System.out.println("El dia que ingresaste es incorrecto");
			JOptionPane.showMessageDialog(null, "La fecha es incorrecta no existe ese mes");
			System.out.println("El mes que ingresaste es incorrecto");
			JOptionPane.showMessageDialog(null, "Año incorrecto");
			System.out.println("El año es incorrecto no existe el año cero");

		}
	}

}
