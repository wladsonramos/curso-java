package estruturasdecontrole;

import java.util.Scanner;

public class ImprimirLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = in.nextLine();
		
		for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            System.out.println(letra);
        }
		
		in.close();
		
	}

}
