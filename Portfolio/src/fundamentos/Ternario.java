package fundamentos;

public class Ternario {

	public static void main(String[] args) {

		double media = 5.6;
		//String resultadoParcial = media >= 5.0 ? "Em recuperação " : "reprovado.";
		String resultadofinal = media >= 7.0 ? "Aprovado" : "Reprovado";
		
		System.out.println("O aluno está " + resultadofinal);
	}
}
