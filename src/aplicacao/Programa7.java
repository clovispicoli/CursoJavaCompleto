package aplicacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado2;

public class Programa7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado2> list = new ArrayList<>();
		
		// Part 1 - Lendo Dados:
		
		System.out.print("Quantos funcionarios serao registrados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (temId(list, id)) {
				System.out.print("Este Id ja existe. Tente novamente");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new Empregado2(id, nome, salario));
			
		}
		
		// Parte 2: Atualizando o salario do funcionario:
		
		System.out.println();
		System.out.print("Insira o Id do funcionario que tera aumento de salario: ");
		int id = sc.nextInt();
		Empregado2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este Id nao existe!");
			
		}
		else {
			System.out.print("Insira a porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.aumentarSalario(porcentagem);
		}
		
		// Parte 3: Listagem de Funcionarios
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for (Empregado2 obj: list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean temId(List<Empregado2> list, int id) {
		Empregado2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}















