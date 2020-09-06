package course;

import java.util.Scanner;

public class estRepWhileSenha {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int valor = 2002;
		
		while(senha != valor) {
			
				System.out.println("Senha invalida");
				senha = sc.nextInt();
		}
		
			System.out.println("Acesso permitido");
		
		sc.close();

	}

}
