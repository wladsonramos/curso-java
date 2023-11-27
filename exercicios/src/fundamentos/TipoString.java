package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World".charAt(1));
		
		String s = "teste";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s.toLowerCase().startsWith("t"));
		System.out.println(s.endsWith("e"));
		System.out.println(s.length());
		System.out.println(s.equals("TESTE"));
		System.out.println(s.equalsIgnoreCase("teste"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 30;
		var salario = 1200.50;
		
		System.out.printf("Nome: %s %s Idade: %d Salario: %.2f", nome, sobrenome, idade, salario);
	}

}
