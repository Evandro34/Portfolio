package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Criar um programa que leia um valor e 
		 * apresente os resultados ao quadrado e ao cubo do valor.
		 */
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o numero ");
		double num1 = entrada.nextDouble();

		double quadrado = (Math.pow(num1,2));
		double cubo = (Math.pow(num1,3));

		System.out.println("O mumero  " + num1 + " elevado ao quadrado e "+ quadrado);
		System.out.println("O mumero  " + num1 + " elevado ao cubo e "+ cubo);
		entrada.close();

	}

}
