package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.3213125345435345433; //explicita (cast)
		System.out.println(b);
		
		int c = 127;
		byte d = (byte) c; //explicita (cast)
		System.out.println(d);
		
		double e = 1.23;
		int f = (int) e; //explicita (cast)
		System.out.println(f); 
	}

}
