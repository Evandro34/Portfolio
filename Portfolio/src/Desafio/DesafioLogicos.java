package Desafio;

public class DesafioLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comproutv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou tv 50\"?" + comprouTv50);
		
		System.out.println("Comprou tv 32\"?" + comproutv32);
		
		System.out.println("Comprou Sorvete ?" + comprouSorvete);
		
		System.out.println("Mais saudável?" + maisSaudavel);

	}

}
