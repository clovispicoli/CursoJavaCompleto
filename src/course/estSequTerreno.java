package course;

import java.util.Locale;
import java.util.Scanner;

public class estSequTerreno {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, preco;;
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valor = sc.nextDouble();

		area = largura * comprimento;
		preco = valor * area;
		
		System.out.printf("AREA = %.2f%n" , area);
		System.out.printf("Preco = %.2f%n" , preco);
		
		sc.close();
	}

}
