package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite a quantidade de notas");
		Scanner in = new Scanner(System.in);
		
		int qt = in.nextInt();
		double[] notas = new double[qt];
		double soma = 0;
		
		
		for (int i = 0; i < qt; i++) {
			notas[i] = in.nextDouble();
		}
		
		for (double nota: notas) {
			soma += nota;
		}
		
		System.out.println(soma/qt);
		
		in.close();
	}	

}
