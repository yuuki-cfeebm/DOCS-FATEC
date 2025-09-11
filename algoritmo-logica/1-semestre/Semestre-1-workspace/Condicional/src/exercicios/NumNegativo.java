package exercicios;

import java.util.Scanner;

public class NumNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um número negativo: ");
		number = entrada.nextInt();
		
		if(number < 0) {
			System.out.print("É negativo");
		}
	}
}
