package exercicios;

import java.util.Scanner;

public class exercicio1J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double temp, fah;
		
		System.out.println("Digite a temperatura em celsius");
		temp = entrada.nextDouble();
		
		fah = (9 * temp + 160)/5;	
		
		System.out.println("Temperatura convertida para Fahreinhrit: " + fah);
	}

}
