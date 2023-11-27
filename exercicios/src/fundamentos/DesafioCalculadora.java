package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		double n1 = in.nextDouble();
		double n2 = in.nextDouble();
	
		String op = in.next();
		
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
		System.out.println(resultado);
		in.close();

	}

}
