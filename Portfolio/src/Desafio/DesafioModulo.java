package Desafio;

import javax.swing.JOptionPane;

public class DesafioModulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String numero1 = JOptionPane.showInputDialog("Informe o numero");
		double num1 = Double.parseDouble(numero1);
		String numero2 = JOptionPane.showInputDialog("Informe o numero");
		double num2 = Double.parseDouble(numero2);
		
		String operacao = JOptionPane.showInputDialog("Informe a operação");
		
		
		double resultado = "+".equals(operacao)?num1+num2:0;
		resultado = "-".equals(operacao)?num1-num2:resultado;
		resultado = "*".equals(operacao)?num1*num2:resultado;
		resultado = "/".equals(operacao)?num1/num2:resultado;
		resultado = "%".equals(operacao)?num1/num2:resultado;
		System.out.printf("%.2f %s %.2f = %.2f",num1,operacao,num2,resultado);
		

	}

}
