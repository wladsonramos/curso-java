package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("Tabela verdade E (And)");
		System.out.println(true && true);
		System.out.println(true && false);
		// System.out.println(false && true);
		// System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (Or)");
		// System.out.println(true || true);
		// System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU Exclusivo (Xor)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		
	}	

}
