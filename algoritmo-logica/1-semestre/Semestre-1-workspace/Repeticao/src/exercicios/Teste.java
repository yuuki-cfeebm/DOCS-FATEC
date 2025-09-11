package exercicios;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int n;
		System.out.println("Digite o valor de n: ");
		n = entrada.nextInt();
		
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				System.out.println("Divisores de " +n+ ": " +i);
			}
		}
	}

}
