package course;

import java.util.Locale;
import java.util.Scanner;

public class notaAluno {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double primeiroBi, segundoBi, total;

		primeiroBi = sc.nextDouble();
		segundoBi = sc.nextDouble();

		total = primeiroBi + segundoBi;

		System.out.println("NOTA FINAL = " + total);
		
		if (total < 60) {
			System.out.println("REPROVADO");
		}

		sc.close();
	}

}
