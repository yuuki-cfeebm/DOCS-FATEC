package aula3Condicional;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 18) {
			System.out.println("Maior de 18 anos");
		} else {
			System.out.println("Menor de 18 anos");
		}
	}

}
