package aula3Condicional;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		double n1, n2, media;
		
		System.out.print("Digite seu nome: ");
		nome = entrada.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		
		media = (n1+n2) / 2;
		System.out.printf(nome + ", sua média é: %.2f \n", media);
		
		if(media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}

}
