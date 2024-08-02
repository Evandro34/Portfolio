package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um programa que leia a temperatura em Celsius e converta para
		 * Fahrenheit.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe  a temperatura ");
		double celsius = entrada.nextDouble();

		double conversao = (celsius*1.8)+32;

		System.out.print("Valor em Celsius: " + conversao);

		entrada.close();
	}

}
