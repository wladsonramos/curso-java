package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // lança uma exceção
		fila.offer("Pedro"); // retorna false
		fila.add("Maria");
		fila.offer("Carlos");
		
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // lança uma exceção
		
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		// fila.contains(...);
				
		
	}

}
