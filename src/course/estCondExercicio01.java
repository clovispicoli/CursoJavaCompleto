package course;

import java.util.Scanner;

public class estCondExercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}
		
		sc.close();
	}

}
