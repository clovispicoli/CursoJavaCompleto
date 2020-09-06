package course;

import java.util.Locale;
import java.util.Scanner;


public class estSequExercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor;
		
		int codigo1 = sc.nextInt();
		int numero1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int numero2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		valor = valor1 * numero1 + valor2 * numero2;
		
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor );
		
		sc.close();

	}

}
