package exercicios;

import java.util.Scanner;

public class exercicio13J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, res;
		
		System.out.println("Digite o valor de a: ");
		a = entrada.nextInt();
		System.out.println("Digite o valor de b: ");
		b = entrada.nextInt();
		System.out.println("Digite o valor de c: ");
		c = entrada.nextInt();
		
		res = (a*a) + (b*b) + (c*c);
		
		System.out.println("Resultado da soma dos quadrados: " + res);
	}

}
