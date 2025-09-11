package exercicios;

import java.util.Scanner;

public class exercicio8J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double comp, larg, alt, vol;
		
		System.out.println("Digite o comprimento: ");
		comp = entrada.nextDouble();
		System.out.println("Digite a largura: ");
		larg = entrada.nextDouble();
		System.out.println("Digite a altura: ");
		alt = entrada.nextDouble();
		
		vol = comp * alt * larg;
		
		System.out.println("O volume da caixa é: " + vol);
	}

}
