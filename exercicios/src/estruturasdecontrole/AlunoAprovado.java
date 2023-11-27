package estruturasdecontrole;

import java.util.Scanner;

public class AlunoAprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite a primeira nota");
		Scanner in = new Scanner(System.in);
		double nota1 = in.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = in.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7)
			System.out.println("Aprovado");
		else if(media < 7 && media > 4)
			System.out.println("Recuperacao");
		else
			System.out.println("Reprovado");
		
		in.close();
	}

}
