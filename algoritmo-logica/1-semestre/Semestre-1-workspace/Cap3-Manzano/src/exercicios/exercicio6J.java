package exercicios;

import java.util.Scanner;

public class exercicio6J {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite o valor de A: ");
		A = entrada.nextInt();
		System.out.println("Digite o valor de B: ");
		B = entrada.nextInt();
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("Valores invertidos: ");
		System.out.println(A);
		System.out.println(B);
		
	}
}
