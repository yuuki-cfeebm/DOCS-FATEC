package exercicios;

import java.util.Scanner;

public class exercicio7J {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d, soma, multi;
		
		System.out.println("Digite o valor de a:");
		a = entrada.nextInt();
		System.out.println("Digite o valor de b:");
		b = entrada.nextInt();
		System.out.println("Digite o valor de c:");
		c = entrada.nextInt();
		System.out.println("Digite o valor de d:");
		d = entrada.nextInt();
		
		soma = a+b + a+c + a+d + b+c + b+d + c+d;
		multi = (a*b) + (a*c) + (a*d) + (b*c) + (b*d) + (c*d);

		System.out.println("Soma: " + soma);
		System.out.println("Multiplicação: " + multi);
	}
}
