package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o primeiro salario ");
		String salario1 = in.next().replace(",", ".");
		System.out.print("Digite o segundo salario ");
		String salario2 = in.next().replace(",", ".");
		System.out.print("Digite o terceiro salario ");
		String salario3 = in.next().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double mediaSalarios = (sal1 + sal2 + sal3) / 3;
		System.out.printf("A media dos salarios e %.3f",  mediaSalarios);
		
		in.close();
	}

}
