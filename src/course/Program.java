package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os tres numero: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int superior = max(a, b, c);

		showResult(superior);

		sc.close();
	}


	public static int max(int x, int y, int z) {

		int aux;
		if (x > y && x > z) {
			aux = x;

		}else if (y > z) {
			aux = y;

		}else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Supeior: " + value);

	}

}
