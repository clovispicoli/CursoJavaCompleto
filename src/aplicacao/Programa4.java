package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilidade.ConversorDeMoeda;

public class Programa4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preco do dolar? ");
		double precoDolar = sc.nextDouble();
		System.out.print("Quantos dolares serao comprados? ");
		double montante = sc.nextDouble();
		double resultado = ConversorDeMoeda.dolarParaReal(montante, precoDolar);
		System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
		

		sc.close();
	}

}
