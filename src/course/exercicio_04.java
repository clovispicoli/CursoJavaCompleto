package course;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		double hora = sc.nextDouble();
		double valor = sc.nextDouble();
		
		double salario = hora * valor;
		
		System.out.println("Numero: " + numero);
		System.out.println("Salario: U$ " + salario);
		
		
		
		sc.close();

	}

}
