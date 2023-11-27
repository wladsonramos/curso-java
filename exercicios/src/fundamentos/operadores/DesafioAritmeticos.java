package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int form1 = (int) Math.pow(6 * (3 + 2), 2) / (3 * 2);
		int form2 = (int) Math.pow((1 - 5) * (2 - 7) / 2, 2);
		int form3 = (int) Math.pow(form1 - form2, 3);
		int form4 = (int) form3 / (int) Math.pow(10, 3);
		
		System.out.println(form4);
	}

}
