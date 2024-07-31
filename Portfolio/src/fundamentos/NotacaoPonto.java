package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 2.3;// primitivo nao tem operador "."
		String s = "Bom dia X";
		
		s= s.replace("X", "Senhor");//subsitui o x por senhora 
		s=s.toUpperCase();//toda letras maiusculos
		s=s.concat("!!!");
		
		System.out.println(s);
		
		String x  = "Evandro".toUpperCase();
		System.out.println(x);
		
		String y = "Bom Dia X"
				.replace("X", "Evan")
				.toUpperCase()
				.concat("!!!");
				;
		System.out.println(y);
				
				
		
		
	}

}
