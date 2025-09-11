package aula3Condicional;

import java.util.Scanner;

public class CalcularSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite seu salário: ");
		salario = entrada.nextDouble();
		
		if(salario < 1500) {
			salario += salario * 0.15;
			//System.out.print("Salário ajustado: " + salario);
			System.out.printf("Salário ajustado: %.2f",salario);
		} else {
			System.out.println("Não haverá aumento.");
		}
	}

}
