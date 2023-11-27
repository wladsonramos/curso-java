package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuicao por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b + "\n");
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuicao por refencia
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2023;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada() + "\n");
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada() + "\n");
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		System.out.println("Data default");
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
