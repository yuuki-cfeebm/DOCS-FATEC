package exercicios_pdf;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int num1, num2, res;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ent.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ent.nextInt();
		
		do {
			if(num2 == 0) {
				System.out.println("Número inválido, digite novamente: ");
				num2 = ent.nextInt();
			}
		} while (num2 == 0);
		
		res = num1 / num2;
		System.out.println("Resultado da divisão: " + res);
	}

}
