package exercicios;

import java.util.Scanner;

public class exercicio5J {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor, prestacao, taxa, tempo;
		
		System.out.println("Digite o valor: ");
		valor = entrada.nextDouble();
		System.out.println("Digite o atraso: ");
		tempo = entrada.nextDouble();
		System.out.println("Digite o valor da texa: ");
		taxa = entrada.nextDouble();
		
		prestacao = valor + (valor * (taxa/100) * tempo);
		
		System.out.println("Valor da prestação em atraso: " + prestacao);
	}
}

