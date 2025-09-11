package exercicios_pdf;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		double num1, num2, res;
		int opcao;
		
		do {
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
			System.out.printf("Resultado da divisão: %.2f \n", res);
			
			do {
				System.out.println("Deseja efetuar outro cálculo? : 1.sim || 2.não ");
				opcao = ent.nextInt();
			
			} while(opcao < 1 || opcao > 2);
			
			switch(opcao) {
			case 1:
				System.out.println("Efetuar outro cálculo");
				break;
			case 2: 
				System.out.println("Não efetuar outro cálculo");
				break;
			default:
			}
		}while (opcao != 2);
	}

}
