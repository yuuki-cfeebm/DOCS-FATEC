package exercicios;

import java.util.Scanner;

public class exercicioD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3, n4, mediaA, notaExame, mediaB=0;
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		System.out.println("Digite a quarta nota: ");
		n4 = entrada.nextDouble();
		
		mediaA = (n1+n2+n3+n4) / 4;
		
		if(mediaA >= 7) {
			System.out.printf("Aprovado!, nota obtida: %.2f", mediaA);
		} else {
			System.out.printf("Reprovado, nota obtida: %.2f \nDigite a nota de exame: ", mediaA);
			notaExame = entrada.nextDouble();
			mediaB = (mediaA + notaExame)/2;
			
			if(mediaB >= 5) {
				System.out.printf("Aprovado em exame!, nota obtida: %.2f", mediaA);
			} else {
				System.out.printf("reprovado, nota obtida: %.2f", mediaB);
			}
		}
	}

}
