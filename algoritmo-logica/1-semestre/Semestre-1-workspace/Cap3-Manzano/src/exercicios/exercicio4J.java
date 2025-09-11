package exercicios;

import java.util.Scanner;

public class exercicio4J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double dist, tempo, velo, litrosUsados;
		
		System.out.println("Digite o tempo gasto: ");
		tempo = entrada.nextDouble();
		System.out.println("Digite a velocidade média: ");
		velo = entrada.nextDouble();
		
		dist = tempo * velo;
		litrosUsados = dist/12;
		
		System.out.println("Velocidade média: " + velo);
		System.out.println("Tempo gasto na viagem: " + tempo);
		System.out.println("Distância percorrida: " + dist);
		System.out.println("Quantidade de litros utilizada: " + litrosUsados);
	}

}
