package estruturasdecontrole;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o ano");
		Scanner in = new Scanner(System.in);
		int ano = in.nextInt();
		
		if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			System.out.println("O ano " + ano + " e bissexto!");
		}else {
			System.out.println("O ano nao e bissexto");
		}
		
		in.close();
	}

}
