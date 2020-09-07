package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudante;

public class Programa3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		estudante.nome = sc.nextLine();
		estudante.grade1 = sc.nextDouble();
		estudante.grade2 = sc.nextDouble();
		estudante.grade3 = sc.nextDouble();
		
		System.out.printf("Grade final: %.2f%n", estudante.finalGrade());
		
		if (estudante.finalGrade() < 60.0) {
			System.out.println("Falhou");
			System.out.printf("Faltando %.2f Pontos%n", estudante.pontosFaltando());
			
		}
		else {
			System.out.println("Passou");
		}
		
		sc.close();
	}

}
