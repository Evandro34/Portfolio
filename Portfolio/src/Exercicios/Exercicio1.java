package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe  a temperatura ");
		double fahrenheit = entrada.nextDouble();
		
		
		double conversao = (fahrenheit -32)/1.8;
		
		
		System.out.print("Valor em Celsius: " + conversao);
		
		entrada.close();
	}

}
