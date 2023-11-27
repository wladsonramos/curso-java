package fundamentos.operadores;
import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner in = new Scanner(System.in);
		
		String s2 = in.next();
		System.out.println("2" == s2);
		System.out.println("2".equals(s2));
		in.close();
	}

}
