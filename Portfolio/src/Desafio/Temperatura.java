package Desafio;

public class Temperatura {

	public static void main(String[] args) {
		

		//formula para converter fahreneit em celsius  (ºF-32 x5/9 =ºC)
		double fahreneit=86;
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double celsius = (fahreneit-AJUSTE)*FATOR;
		
		System.out.println("O resultado é " +celsius +" ºC");
	}

}
