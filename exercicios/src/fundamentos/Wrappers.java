package fundamentos;


public class Wrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*4);
		System.out.println(l*3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c + "!!!");
		
		char ch = 't';
		Character w = Character.valueOf(ch);
		System.out.println(Character.toUpperCase(w));
		

	}

}
