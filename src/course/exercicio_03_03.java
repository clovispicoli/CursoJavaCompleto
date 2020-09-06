package course;

import java.util.Scanner;

public class exercicio_03_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valorA = sc.nextInt();
		int valorB = sc.nextInt();
		
		if (valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.printf("Nao sao multiplos %n");
		}
		sc.close();

	}

}
