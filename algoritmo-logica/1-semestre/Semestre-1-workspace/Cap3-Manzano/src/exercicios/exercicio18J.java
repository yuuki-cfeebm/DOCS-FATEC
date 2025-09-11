package exercicios;

import java.util.Scanner;

public class exercicio18J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int total, votoVA, votoBA, votoNA, votoVB, votoBB, votoNB, votoVC, votoBC, votoNC;
		double percVotoV, percVotoB, percVotoN, percVotoVA, percVotoVB, percVotoVC;
		
		System.out.println("Digite o valor de votos válidos de a: ");
		votoVA = entrada.nextInt();
		System.out.println("Digite o valor de votos em branco de a: ");
		votoBA = entrada.nextInt();
		System.out.println("Digite a quantidade de votos nulos de a: ");
		votoNA = entrada.nextInt();
		
		System.out.println("Digite o valor de votos válidos de b: ");
		votoVB = entrada.nextInt();
		System.out.println("Digite a quantidade de votos nulos de b: ");
		votoNB = entrada.nextInt();
		System.out.println("Digite o valor de votos em branco de b: ");
		votoBB = entrada.nextInt();
		
		System.out.println("Digite o valor de votos válidos de c: ");
		votoVC = entrada.nextInt();
		System.out.println("Digite a quantidade de votos nulos de c: ");
		votoNC = entrada.nextInt();
		System.out.println("Digite o valor de votos em branco de c: ");
		votoBC = entrada.nextInt();
		
		total = votoVA + votoBA + votoNA + votoVB+ votoBB+votoNB+votoVC+ votoBC+ votoNC;
		percVotoV = ((votoVA + votoVB + votoVC) * 100) / total;
		percVotoN = ((votoNA + votoNB + votoNC) * 100) / total;
		percVotoB = ((votoBA + votoBB + votoBC) * 100) / total;
		
		percVotoVA = (votoVA * 100) / total;
		percVotoVB = (votoVB * 100) / total;
		percVotoVC = (votoVC * 100) / total;
		
		System.out.println("Quantidade total de eleitores: " + total);
		System.out.println("Percentual de votos válidos(%): " + percVotoV);
		System.out.println("Percentual de votos nulos(%): " + percVotoN);
		System.out.println("Percentual de votos em branco(%): " + percVotoB);
		System.out.println("Percentual de votos válidos de A em relação ao total de votos (%): " + percVotoVA);
		System.out.println("Percentual de votos válidos de B em relação ao total de votos (%): " + percVotoVB);
		System.out.println("Percentual de votos válidos de C em relação ao total de votos (%): " + percVotoVC);
		
	}	

}
