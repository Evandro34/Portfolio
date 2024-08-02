package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um programa que leia
		 *  o peso e a altura do usuário e imprima no console o IMC.
		 */
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o peso ");
		double peso = entrada.nextDouble();

		System.out.println("Informe  a altura ");
		String altura1 = entrada.next().replace(",", ".");
		double altura = Double .parseDouble(altura1);

		double imc = peso/(Math.pow(altura,2));

		System.out.print("O IMC E: " + imc);

		entrada.close();

	}

}
