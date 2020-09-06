package course;

import java.util.Scanner;

public class estRepWhileDecCre {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while( x != y ) {
			if (x < y) {
				System.out.println("crescente");
			}
			else {
				System.out.println("decrescente");
			}
		
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
