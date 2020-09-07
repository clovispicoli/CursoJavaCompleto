package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo ret = new Retangulo();

		System.out.println("Insira a largura e a altura do retangulo: ");
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", ret.area());
		System.out.printf("Perimetro = %.2f%n", ret.perimetro());
		System.out.printf("Diagonal = %.2f%n", ret.diagonal());
		sc.close();

	}

}
