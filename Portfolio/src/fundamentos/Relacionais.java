package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a= 97;
		int b= 'a';
		
		System.out.println(a==b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(4 != 5);
		
		
		double nota = 7.3;
		
		boolean bomComportamento = true;
		boolean passaPorMedia = nota >=7;
		
		boolean temdesconto =bomComportamento && passaPorMedia;
				
		System.out.println("Tem desconto? " + temdesconto);
		
	}

}
