package oo.desafio;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 5, 5);
		compra1.adicionarItem(new Produto("Caderno", 35), 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Notebook", 1000, 1);
		compra2.adicionarItem(new Produto("Teclado", 200), 1);
		
		Cliente cliente = new Cliente("Maria");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.nomeString);
		System.out.println(cliente.obterValorTotal());

	}

}
