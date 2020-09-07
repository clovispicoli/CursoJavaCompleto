package aplicacao;

import java.util.Date;

import entidades.Ordem;
import entidades.enums.StatusPedido;

public class Programa10 {

	public static void main(String[] args) {
		

		Ordem ordem = new Ordem(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);
		
		System.out.println(ordem);
		
		StatusPedido os1 = StatusPedido.ENTREGUE;
		
		StatusPedido os2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
