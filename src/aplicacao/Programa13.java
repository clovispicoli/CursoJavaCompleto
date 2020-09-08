package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemDoPedido;
import entidades.Produto;

public class Programa13 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente cli = new Cliente();
		
		sc.close();
	}

}
