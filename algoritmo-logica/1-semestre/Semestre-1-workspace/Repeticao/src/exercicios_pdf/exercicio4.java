package exercicios_pdf;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int num, coluna=1, linha=1, cont=4;
		
		System.out.println("Digite um número: ");
		num = ent.nextInt();
		
		while(coluna <= 4) {
			while(linha <= cont) {
				System.out.print(num+linha+" ");
				linha++; 
			}
			System.out.println("");
			System.out.println("linha" +linha);
			System.out.println("cont" + cont);
			linha = linha - 3;
			cont = cont + 1;
			System.out.println("linha" +linha);
			System.out.println("cont" + cont);
			coluna++;
		}
		
	}

}
