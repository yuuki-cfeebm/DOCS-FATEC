package exercicios;

import java.util.Scanner;

public class exercicio11J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double valorDol, cotaDol, conver;
		
		System.out.println("Digite a cotação do dólar: ");
		cotaDol = entrada.nextDouble();
		System.out.println("Digite a quantidade em dólares: ");
		valorDol = entrada.nextDouble();
		
		conver = valorDol * cotaDol;
		
		System.out.println("Conversão de dólar para real: " + conver);
	}

}
