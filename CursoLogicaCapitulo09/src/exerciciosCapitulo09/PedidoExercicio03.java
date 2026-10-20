package exerciciosCapitulo09;

public class PedidoExercicio03 {
	
	Integer codigo;
	
	Double subTotal;
	
	Double desconto;
	
//	Double total;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal(Double subTotal, Double desconto) {
		Double total = subTotal - desconto;
		return total;
	}

//	public void setTotal(Double total) {
//		this.total = total;
//	}

}
