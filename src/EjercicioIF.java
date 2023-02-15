import java.util.Scanner;

public class EjercicioIF {

	public static void main(String[] args) {
		int numero;
		@SuppressWarnings("resource")
		Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Digite el numero de su preferencia");
		numero = entradaDatos.nextInt();
		if (numero > 10) {
			System.out.println("El numero es mayor que diez y se cumple la condición verdadera");
		} else {
			System.out.println("El numero es menor que diez");

		}
	}

}
