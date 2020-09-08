package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Postar;

public class Programa12 {

	public static void main(String[] args) throws ParseException {
		 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viajem");
		Comentario c2 = new Comentario("Uau isso é incrivel");
		
		Postar p1 = new Postar(
							   sdf.parse("21/06/2018 13:05:44"),
							   "Viajar para Nova Zelandia", 
							   "Visitar este pais maravilhoso!",
							   12);
		p1.addComente(c1);
		p1.addComente(c2);
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Que a forca esteja com voce");
		
		Postar p2 = new Postar(
					           sdf.parse("28/07/2018 23:14:19"),
				               "Boa noite galera", 
				               "Te vejo amanha",
				               5);
		p2.addComente(c3);
		p2.addComente(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
