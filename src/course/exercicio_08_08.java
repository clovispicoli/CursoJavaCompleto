package course;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08_08 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ir;
		double valor = sc.nextDouble();
		
		if (valor <= 2000.0) {
			ir = 0.0;
			System.out.println("Isento");
			
		}else if (valor >= 2000.01 && valor <= 3000.00) {
			ir = (valor - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n" , ir);
			
		}else if (valor >= 3000.01 && valor <= 4500.00) {
			ir = (valor - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n" , ir);
		}else {
			ir = (valor - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n" , ir);
		}
		
		
		sc.close();
	}

}
