package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado =  new Scanner(System.in);
		
		
		System.out.print("Informe o primeiro salario: ");
		String valor1= teclado.next().replace(",", ".");
		System.out.print("Informe o segundo  salario: ");
		String valor2= teclado.next().replace(",", ".");
		System.out.print("Informe o terceiro salario: ");
		String valor3= teclado.next().replace(",", ".");
		
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1+salario2+salario3)/3;
		
		System.out.print(" A média dos salário é  "+ media);
		teclado.close();
	}

}
