package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os tres numero: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("Superior: " + a);

		}
		else if (b > c) {
			System.out.println("Superior: " + b);
			
		}
		else {
			System.out.println("Superior: " + c);
			
		}

		sc.close();
	}

}
