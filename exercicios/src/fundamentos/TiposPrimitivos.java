package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações de um funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		
		// Tipos numéricos reais
		float salario = 39_445.44F;
		double vendasAcumuladas = 2_991_797_101.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // Ativos
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numéros de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha => " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
