package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemDoPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.StatusDoPedido;

public class Programa13 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataDeNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataDeNascimento);
		
		System.out.println("Insira os dados do pedido: ");
		System.out.print("Status: ");
		StatusDoPedido status = StatusDoPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Quantos itens para este pedido? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Insira os dados do item: # " + i);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeDoProduto = sc.nextLine();
			System.out.print("Preco do produto: ");
			double precoDoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeDoProduto, precoDoProduto);
			
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			ItemDoPedido it = new ItemDoPedido(quantidade, precoDoProduto, produto);
			
			pedido.addItem(it);
			
		}
		
		System.out.println();
		System.out.println("RESUMO DO PEDIDO");
		System.out.println(pedido);
		
		sc.close();
	}

}













