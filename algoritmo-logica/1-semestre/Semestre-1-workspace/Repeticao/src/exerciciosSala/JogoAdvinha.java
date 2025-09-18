package exerciciosSala;
import java.util.Scanner;
import java.util.Random;

public class JogoAdvinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int sorteado, chute, tentativas=0, max;
		max = 10;
		
		Random random = new Random();
		sorteado = random.nextInt(max) + 1;
		
		System.out.println("Faça sua aposta!!!");
		
		do {
			System.out.print("\nDigite um número de 1 a 10: ");
			chute = ent.nextInt();
			tentativas+=1;
			
			if(chute != sorteado) {
				if(chute > sorteado) {
					System.out.print("\nO número é menor");
				} else if(chute < sorteado){
					System.out.print("\nO número é maior"); 
				}
				
				switch(tentativas) {
				case 1:
					System.out.println("\nPrimeira tentativa, tente de novo");
					break;
				case 2:
					System.out.println("\nruim demai, tente de novo");
					break;
				case 3:
					System.out.println("\nda não man");
					break;
				default:
				}
			}
			
		} while(chute != sorteado);
			
		System.out.println("\nAcertou!!! Número sorteado: " + sorteado);
		System.out.println("Número de tentativas: " + tentativas);
	}

}
