package exercicios;

import java.util.Scanner;

public class exercicio9J {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, res;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		res = num * num;
		
		System.out.println("Quadrado do número é: " + res);
	}
}
