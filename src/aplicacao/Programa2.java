package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		System.out.print("Name: ");
		emp.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + emp);
		System.out.println();
		System.out.println("Qual o percentual para aumentar o salario? ");
		double percentual = sc.nextDouble();
		emp.aumentoSalario(percentual);
		
		System.out.println();
		System.out.println("Dados atualizados: " + emp);
		sc.close();

	}

}
