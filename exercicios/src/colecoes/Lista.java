package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Carlos"));
		
		System.out.println(lista.get(2));
		
		System.out.println("nome removido " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Carlos")));
		
		System.out.println("contem " + lista.contains(new Usuario("Ana")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}

	}

}
