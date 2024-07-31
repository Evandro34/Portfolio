package fundamentos;

public class ConversaoTipoPimitivoNumerico {

	public static void main(String[] args) {
		
		
		double a= 1;
		System.out.println(a);
		
		
		float b= (float)1.234565;// explícita (cast)
		System.out.println(b);

		int c= 127;
		byte d = (byte)c;// explícita (cast)
		System.out.println(d);
		
		
		double e = 1.999999;
		int f = (int)e;
		System.out.println(f);
	}

}
