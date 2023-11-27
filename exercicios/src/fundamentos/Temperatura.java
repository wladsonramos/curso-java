package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f = 86;
		final int ajuste = 32;
		final double fator = 5.0/9.0;
		
		double c = (f - ajuste) * fator;
		
		System.out.println("O resultado e " + c);
	}

}
