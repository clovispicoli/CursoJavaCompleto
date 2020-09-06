package course;

import java.util.Locale;
import java.util.Scanner;

public class estCondNotaAluno {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double primeiroBi, segundoBi, total;

		primeiroBi = sc.nextDouble();
		segundoBi = sc.nextDouble();

		total = primeiroBi + segundoBi;

		System.out.printf("NOTA FINAL = %.1f%n", total);
		
		if (total < 60.0) {
			
			System.out.println("REPROVADO");
		}

		sc.close();
	}

}
 