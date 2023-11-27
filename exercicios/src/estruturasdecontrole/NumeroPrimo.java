package estruturasdecontrole;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite um numero");
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int ct = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                ct++;
            }
        }

        if (ct == 2) {
            System.out.println("O numero " + num + " e primo.");
        } else {
            System.out.println("O numero " + num + " nao e primo.");
        }
		
		in.close();
	}

}
