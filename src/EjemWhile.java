import javax.swing.JOptionPane;

public class EjemWhile {

	public static void main(String[] args) {
		int numero, cuadrado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero"));
		while (numero >=0) {
			cuadrado= (int) Math.pow(numero, 2);
			JOptionPane.showMessageDialog(null, "El numero " + numero + " elevado al cuadrado es: " + cuadrado);
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero"));
		}
		System.out.println("El numero introducido es negativo");
		
		
	}

}
