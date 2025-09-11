package exercicios;

import java.util.Scanner;

public class exercicio16J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double SM, PR, NS;
		
		System.out.println("Digite o salário mensal: ");
		SM = entrada.nextDouble();
		System.out.println("Digite o percentual de reajuste: ");
		PR = entrada.nextDouble();
		
		PR = PR/100;
		NS = SM - (SM * PR);
		
		System.out.println("Valor do novo salário: " + NS);
	}

}
