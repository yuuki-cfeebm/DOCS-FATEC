package exercicios;

import java.util.Scanner;

public class exercicio15J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d, P, S;
		
		System.out.println("Digite o valor de a: ");
		a = entrada.nextInt();
		System.out.println("Digite o valor de b: ");
		b = entrada.nextInt();
		System.out.println("Digite o valor de c: ");
		c = entrada.nextInt();
		System.out.println("Digite o valor de d: ");
		d = entrada.nextInt();
		
		P = a*c;
		S = b+d;
		
		System.out.println("Resultado do produto: " + P);
		System.out.println("Resultado da soma: " + S);
	}

}
