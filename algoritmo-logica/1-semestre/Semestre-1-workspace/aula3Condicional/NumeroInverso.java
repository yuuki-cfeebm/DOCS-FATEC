package divisaoInteiros;

import java.util.Scanner;

public class NumeroInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num, digitoF, digitoI, digitoMeio;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		digitoF = num / 100;
		digitoI = num % 10;
		digitoMeio = (num / 10) % 10;
		
		digitoI *= 100;
		digitoMeio *= 10;
		
		System.out.println(digitoI);
		System.out.println(digitoMeio);
		System.out.println(digitoF);
		System.out.println("O número invertido é: " + (digitoI + digitoMeio + digitoF));
	}

}
