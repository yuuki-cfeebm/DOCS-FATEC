package exercicios;

import java.util.Scanner;

public class exercicio17J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double A, R;
		
		System.out.println("Digite o valor do raio: ");
		R = entrada.nextDouble();
		
		A = 3.14159 * R * R;
		
		System.out.println("Valor da área: " + A);
	}

}
