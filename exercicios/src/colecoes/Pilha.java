package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.push("Don quixote");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for (String livro: livros) {
			System.out.println("nome do livro " + livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		//livros.size();
		//livros.contains();
		//livros.clear();
		//livros.isEmpty();
		
	}

}
