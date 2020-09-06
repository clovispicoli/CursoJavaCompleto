package course;

import java.util.Scanner;

public class exercicio_04_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaIni = sc. nextInt();
		int horaFim = sc.nextInt();
		
		int duracao;
		if (horaIni < horaFim) {
			duracao = horaFim - horaIni;
		}
		else {
			duracao = 24 - horaIni + horaFim;
		}
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		sc.close();
	}

}
