package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data(31, 7, 2023);
		
		d1.obterDataFormatada();
		d2.obterDataFormatada();

		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}

}
