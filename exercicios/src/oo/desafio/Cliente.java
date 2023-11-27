package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nomeString;
	
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nomeString = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}

}
