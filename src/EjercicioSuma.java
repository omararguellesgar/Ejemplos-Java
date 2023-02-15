import java.util.Scanner;

public class EjercicioSuma {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entradaDatos = new Scanner(System.in);
		float guillermo, luis, lalo, total;
		System.out.println("Digite la cantidad de dinero que tiene Guillermo");
		guillermo = entradaDatos.nextFloat();
		luis = guillermo / 2;
		lalo = (guillermo + luis) / 2;
		total = guillermo + luis + lalo;
		System.out.println("La cantidad de dinero de Guillermo es : " + guillermo);
		System.out.println("\nLa cantidad de dinero de Luis es : " + luis);
		System.out.println("\nLa cantidad de dinero de Lalo es : " + lalo);
		System.out.println("\nEl total entre los tres es : " + total);
		

	}

}
