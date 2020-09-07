package aplicacao;

import java.text.ParseException;
import java.util.Scanner;

import entidades.Aluguel;

public class Program6 {

	public static void main(String[] args) throws ParseException {
		

		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vet = new Aluguel[10];
		
		System.out.print("Quantos quartos serao alugados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vet[quarto] = new Aluguel(nome, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
				
			}
		}
		sc.close();
	}

}
