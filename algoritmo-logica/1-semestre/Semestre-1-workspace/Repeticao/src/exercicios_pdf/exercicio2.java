package exercicios_pdf;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = ent.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ent.nextInt();
		
		if(num1 < num2) {
			for(num1+=1;num1 < num2; num1++) {
				System.out.println(num1);
			}
		}
		
	}

}
