package exercicios;

import java.util.Scanner;

public class exercicio3J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double vol, alt, raio;
		
		System.out.println("Digite a altura: ");
		alt = entrada.nextDouble();
		System.out.println("Digite o raio: ");
		raio = entrada.nextDouble();
		
		vol = 3.14159 * raio * raio * alt;
		
		System.out.println("O volume da lata de óleo é: " + vol);
	}

}
