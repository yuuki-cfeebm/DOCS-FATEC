package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int[] lista1 = new int[5];
		int[] lista2 = new int[5];
		
		for(int i=0; i<lista1.length; i++) {
			System.out.println("Digite o valor " +(i+1)+ " da lista 1: ");
			lista1[i] = ent.nextInt();
		}
		
		for(int i=0; i<lista1.length; i++) {
			System.out.println("Digite o valor " +(i+1)+ " da lista 2: ");
			lista2[i] = ent.nextInt();
		}
		
		for(int i=0; i<lista1.length; i++) {
			for(int j=0; j<lista1.length; j++) {
				if(lista1[i] == lista2[j]) {
					System.out.println("O número " + lista1[i] + " está nas duas listas");
				}
			}
		}

	}

}
