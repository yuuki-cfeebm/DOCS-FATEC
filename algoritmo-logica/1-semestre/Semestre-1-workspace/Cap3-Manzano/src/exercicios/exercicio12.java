package exercicios;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double rea, dol, conver, cotaDol;
		
		System.out.println("Digite a cotação do dólar: ");
		cotaDol = entrada.nextDouble();
		System.out.println("Digite a quantidade em reais: ");
		rea = entrada.nextDouble();
		
		conver = rea / cotaDol;
		
		System.out.println("Conversão de real para dólar: " + conver);
	}

}
