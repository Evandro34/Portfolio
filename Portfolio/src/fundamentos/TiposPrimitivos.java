package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informaçoes de funcionario

		// Tipos Numericos inteiros
		byte anosDeEmpresa = 23; // -128 a 127
		short numerosdeVoos = 542;// -32.768 a 32.767
		int id = 56789;// -2.147.483.648 a 2.147.483.647
		long pontosAcumulados = 3_234_845_223L;// -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

		// tipos numericos reais;

		float salario = 11_445.44F;// -3.40292347E+38 a +3.40292347E+38
		double vendasAcumuladas = 2_991_103.01;// -1.79769313486231570E+308 a +1.79769313486231570E+308

		// Tipos booleano

		boolean estaDeFerias = false;// true ou false

		// Tipo caractere
		char status = 'A';

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// numeros de viagens
		System.out.println(numerosdeVoos / 2);
		
		//Pontos real
		
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id +": ganha -> " + salario); 
		
		System.out.println("Férias ? " + estaDeFerias);
		System.out.println("Status "+ status);

	}

}
