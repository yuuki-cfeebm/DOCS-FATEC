package exercicios;

import java.util.Scanner;

public class exercicio14J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, quadrado;
		
		System.out.println("Digite o valor de A: ");
		A = entrada.nextInt();
		System.out.println("Digite o valor de B: ");
		B = entrada.nextInt();
		System.out.println("Digite o valor de C: ");
		C = entrada.nextInt();
		
		quadrado = (A+B+C) * (A+B+C);
				
		System.out.println("Quadrado da soma dos valores: " + quadrado);
	}

}
