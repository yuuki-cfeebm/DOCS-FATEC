package exerciciosSala;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		double num, media, soma=0;
		int cont=0;
		
		do {
			System.out.print("Digite um número: ");
			num = ent.nextDouble();
			cont++;
			soma += num;
			
		} while(num != 0);
		cont-=1;
		media = soma / cont;
		System.out.println("\nNúmeros digitados: " + cont);
		System.out.println("Média: " + media);
	}

}
