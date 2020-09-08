package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalho;

public class Programa11 {

	public static void main(String[] args) throws ParseException {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Insira o nome do departamento ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Insira os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nivel: ");
		String nivelTrabalho = sc.nextLine();
		System.out.print("Salario Base: ");
		double salarioBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalho.valueOf(nivelTrabalho), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos coontratos para este trabalhador? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Insira os dados do contrato #" + i  );
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duracao (horas): ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Insira o mes e o ano para calcular a renda (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda: " + mesEAno + ": " + String.format("%.2f", trabalhador.rendimento(ano, mes)));
		
		

		sc.close();
	}

}
