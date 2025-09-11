package exercicios;

import java.util.Scanner;

public class exercicioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, maiorNum, menorNum, diferenca;
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		
		maiorNum = Math.max(num1, num2);
		menorNum = Math.min(num1, num2);
		diferenca = maiorNum - menorNum;
		
		System.out.printf("A diferença do maior número para o menor é: %d", diferenca);
	}

}
