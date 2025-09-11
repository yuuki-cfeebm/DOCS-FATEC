package exercicios_pdf;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		double num, res=0, cont=0;
		System.out.println("Digite um número: ");
		num = ent.nextDouble();
		res = num;
		while(num > 1) {
			res = res * (num-1);
			num--;
		}
		System.out.println("Resultado: " + res);
	}

}
