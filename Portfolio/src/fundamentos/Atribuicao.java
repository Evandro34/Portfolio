package fundamentos;

public class Atribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = a;
		int c = a + b;

		c = c + b;
		c += b;
		c *= b;
		c -= b;
		c /= b;
		c %= 2;
		System.out.println(c);

	}

}
