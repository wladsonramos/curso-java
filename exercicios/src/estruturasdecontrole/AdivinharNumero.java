package estruturasdecontrole;

import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        int tentativa;
 
        // System.out.println(numeroAleatorio);
        
        for (int i = 9; i >= 0; i--) {
        	
        	System.out.println("Digite o numero que voce acha que foi gerado aleatoriamente");
        	
        	tentativa = in.nextInt();
        	
        	if (tentativa == numeroAleatorio) {
        		System.out.println("Voce acertou");
        		break;
        	} else {
        		System.out.println("Voce errou");
        		if ( tentativa < numeroAleatorio) {
        			System.out.println("Sua tentativa e menor que o numero gerado");
        		} else {
        			System.out.println("Sua tentativa e maior que o numero gerado");
        		}
        		System.out.println("Voce ainda tem " + i + " tentativas");
        	}
        	
        }
        
        
        in.close();
        
        
	}

}
