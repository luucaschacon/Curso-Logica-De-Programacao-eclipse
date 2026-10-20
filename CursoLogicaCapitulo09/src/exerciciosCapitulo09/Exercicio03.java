package exerciciosCapitulo09;

public class Exercicio03 {

	public static void main(String[] args) {
		
		PedidoExercicio03 pedido = new PedidoExercicio03();
		
		pedido.setCodigo(1);
		pedido.setDesconto(20.0);
		pedido.setSubTotal(50.0);
//		pedido.setTotal(30.0);
		
		System.out.println("Pedido: ");
		System.out.println("Código: " + pedido.getCodigo());
		System.out.println("Desconto: " + pedido.getDesconto());
		System.out.println("Sub Total: " + pedido.getSubTotal());
		System.out.println("Total: " + pedido.getTotal(pedido.getSubTotal(), pedido.getDesconto()));
		

	}

}
