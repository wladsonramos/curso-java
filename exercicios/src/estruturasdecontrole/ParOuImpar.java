package estruturasdecontrole;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite um numero");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if((n >= 0 && n <= 10) && n % 2 == 0) {
			System.out.println(n + " E par e esta entre 0 e 10");
		}
		else if((n >= 0 && n <= 10) && n % 2 != 0) {
			System.out.println(n + " Esta entre 0 e 10 mas e impar");
		}
		else {
			System.out.println("O numero nao esta entre 0 e 10");
		}
		
		
		scan.close();

	}

}
