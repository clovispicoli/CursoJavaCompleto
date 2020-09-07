package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class programa5 {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Insira o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Existe um deposito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y'){
		
			System.out.print("Insira o valor do deposito inicial: ");
			double valorInicial = sc.nextDouble();
			conta = new Conta(numero, titular, valorInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Insira o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira o valor de retirada: ");
		double retirarValor = sc.nextDouble();
		conta.retirar(retirarValor);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
	
		sc.close();
	}

}
