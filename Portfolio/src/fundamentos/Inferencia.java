package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		// para inferir  em java a variavel tem que ser iniciada 
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5; errado pois a variavel foi inferida como string  nao sendo  possivel mudar em java o tipo inicial
		
		// para inferencao em java a variavel tem que ser iniciada  
	}

}
