package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou tv 50? " + comprouTV50);
		System.out.println("Comprou tv 32? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudavel? " + maisSaudavel);
		
		

	}

}
