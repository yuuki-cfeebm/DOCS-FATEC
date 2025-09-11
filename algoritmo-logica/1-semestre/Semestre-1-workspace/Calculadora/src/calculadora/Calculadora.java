package calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double num1, num2=0, res=0;
		int operacao;
		String nomeOperacao = "";
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextDouble();
		System.out.println("Selecione qual tipo de operação \n[1] soma \n[2]subtração \n[3]Multiplicação \n[4]Divisão \n[5]Exponenciação \n[6]Raiz Quadrada \n---------- ");
		operacao = entrada.nextInt();
		
		
		switch(operacao) {
		case 1:
			nomeOperacao = "soma";
			System.out.println("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			res = num1 + num2;
			break;
		case 2:
			nomeOperacao = "Subtração";
			System.out.println("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			res = num1 - num2;
			break;
		case 3:
			nomeOperacao = "Multiplicação";
			System.out.println("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			res = num1 * num2;
			break;
		case 4:
			nomeOperacao = "Divisão";
			if(num1 == 0) {
				System.out.println("Não é possível dividir um número por 0!!!");
				break;
			}
			System.out.println("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			 if (num2 == 0) {
				System.out.println("Não é possível dividir um número por 0!!!");
				break;
			}
			 res = num1 / num2;
			break;
		case 5:
			nomeOperacao = "Exponenciação";
			System.out.println("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			res = Math.pow(num1, num2);
			break;
		case 6:
			nomeOperacao = "Raiz Quadrada";
			res = Math.sqrt(num1);
			break;
		}
		
		System.out.println("Operação Selecioanda: " + nomeOperacao + "\nResultado: " + res);
	}

}
