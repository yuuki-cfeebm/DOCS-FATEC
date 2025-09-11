package exercicios;

import java.util.Scanner;

public class exercicio10J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int a, b, res;
		
		System.out.println("Digite o valor de a:");
		a = entrada.nextInt();
		System.out.println("Digite o valor de b:");
		b = entrada.nextInt();
		
		res = a*a - b*b;
		
		System.out.println("O quadrado da diferença do primeiro valor pelo segundo é: " + res);
	}

}
