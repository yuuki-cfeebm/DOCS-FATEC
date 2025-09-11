package exercicios;

import java.util.Scanner;

public class exercicioK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o número: ");
		num = entrada.nextInt();
		
		if(num >= 1 && num <= 9) {
			System.out.println("O valor está na faixa permitida");
		} else {
			System.out.println("O valor está fora da faixa permitida");
		}
	}

}
