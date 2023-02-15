import java.util.Scanner;

public class OperacionesAritmeticas {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite las cantidades ");

		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();

		int suma = numero1 + numero2;
		int multi = (int) Math.multiplyFull(numero1, numero2);
		multi = numero1 * numero2;
		System.out.println("La suma es: " + suma);
		System.out.println("La multiplicaión es: " + multi);
		
		

	}

}
