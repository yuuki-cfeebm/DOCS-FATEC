package exercicios;

import java.util.Scanner;

public class TipoPerfil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int dia, mes, ano, soma;
		String perfil;
		
		System.out.println("Digite o dia de nasicimento: ");
		dia = entrada.nextInt();
		System.out.println("Digite o mes de nasicimento");
		mes = entrada.nextInt();
		System.out.println("Digite o ano de nascimento");
		ano = entrada.nextInt();
		
		soma = (dia + mes + ano)%5;
		
		switch(soma) {
		case 0: 
			perfil = "Tímido";
			break;
		case 1:
			perfil = "Sonhador";
			break;
		case 2:
			perfil = "Paquerador";
			break;
		case 3:
			perfil = "Atraente";
			break;
		case 4: 
			perfil = "Irresistível";
		default: perfil = "Algo nao esta certo";
		}
		
		System.out.println(perfil);
		
	}

}
