package exercicios;

import java.util.Scanner;

public class exercicio2J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double temp, cels;
		
		System.out.println("Digite a temperatura em fahrenheit");
		temp = entrada.nextDouble();
		
		cels = (temp - 32) * (5/9);	
		
		System.out.println("Temperatura convertida para Fahreinhrit: " + cels);
	}

}
