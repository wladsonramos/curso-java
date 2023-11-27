package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner in = new Scanner(System.in);
		System.out.println("Digite seu nome ");
		String nome = in.nextLine();
		System.out.println("Digite seu sobrenome");
		String sobrenome = in.nextLine();
		System.out.println("Digite sua idade");
		int idade = in.nextInt();
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
		
		
		
		in.close();
		
		*/
		
	    Scanner teclado = new Scanner(System.in);
	     
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();
        
        System.out.printf("%d %s %s", idade, nome, sobrenome);
     
        teclado.close();

	}

}
