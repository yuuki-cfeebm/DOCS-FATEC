package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		double[] notas = new double [5];
		double soma=0, media=0, maior=0, menor=0;
		String[] nomes = {"Yuuki", "Marcos", "Deyse", "Gervásio", "Ryan"};
		int cont1=0, cont2=0;
		
		//digitar notas e somas
		for (int i = 0; i < notas.length; i++) {
			System.out.print("\nDigite a nota do aluno " + (i+1) + ": " );
			notas[i] = ent.nextDouble();
			
			//valida a nota
			if(notas[i] < 0 || notas[i] > 10) {
				while(notas[i] < 0 || notas[i] > 10) {
					System.out.println("Nota inválida, digite a nota do aluno " + (+i+1) + " novamente: ");
					notas[i] = ent.nextDouble();					
				}
			}
			
			soma += notas[i];
		}
		
		//maior menor nota
		maior = notas[0];
		menor = notas[0];
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] > maior) {
				maior = notas[i];
				cont1++;
			}
			
			if(notas[i] < menor) {
				menor = notas[i];
				cont2++;
			}
		}
		
		//mostrar notas
		for(double nota : notas) {
			System.out.println(nota);
		}

		System.out.printf("Maior nota foi de %s: %.2f\n", nomes[cont1], maior);
		System.out.printf("Menor nota foi de %s: %.2f\n", nomes[cont2], menor);
		
		media = soma / notas.length;
		System.out.printf("Média das notas: %.2f", media);
		

	}

}
