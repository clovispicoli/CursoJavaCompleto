package course;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorA, valorB, valorC, triRet, circ, trap, quad, ret;
		
		valorA = sc.nextDouble();
		valorB = sc.nextDouble();
		valorC = sc.nextDouble();
		
		triRet = valorA * valorC / 2.0;
		circ = 3.14159 * valorC * valorC;
		trap = (valorA + valorB) / 2.0 * valorC;
		quad = valorB * valorB;
		ret = valorA * valorB;
		
		System.out.printf("TRIANGULO: %.3f%n", triRet);
		System.out.printf("CIRCULO: %.3f%n", circ);
		System.out.printf("TRAPÉZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		
		sc.close();
	}

}
