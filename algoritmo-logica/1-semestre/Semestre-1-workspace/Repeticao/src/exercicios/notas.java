package exercicios;
import java.util.Scanner;
public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double n1, n2, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		
		while(n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 ) {
			if(n1 < 0 || n1 > 10) {
				System.out.println("Digite a primeira nota válida:" );
				n1 = entrada.nextDouble();	
			}
			if(n2 < 0 || n2 > 10) {
				System.out.println("Digite a segunda nota válida:" );
				n2 = entrada.nextDouble();	
			}
		}
		media = (n1 + n2) /2;
		System.out.println("A média é: " + media);
	}

}
