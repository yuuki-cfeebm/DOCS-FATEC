package exercicios;

import java.util.Scanner;

public class calculoDescontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String nomeCliente = "";
		String parceria;
		char tipoCliente;
		
		double valorTotal, desconto;
		int parcelas;
		
		
		
		System.out.println("Digite seu nome: ");
		nomeCliente = entrada.nextLine();
		System.out.println("Digite tipo de cliente: ");
		tipoCliente = entrada.next().charAt(0);
		System.out.println("Digite o valor total de compra:");
		valorTotal = entrada.nextDouble();
		
		if(tipoCliente == 'A') {
			parceria = "Associado Ativo";
			desconto = valorTotal * 0.15;
		} else if (tipoCliente == 'P') {
			parceria = "Parceiro Comercial";
			desconto = valorTotal * 0.10;
		} else {
			parceria = "Não Associado";
			desconto = 0;
		}
		
		valorTotal -= desconto;
		
		if(valorTotal > 500) {
			System.out.println("Digite a opção de parcelamento 3x sem juros ou 4x a 6x com juros de 18% sobre o total de parcelas:");
			parcelas = entrada.nextInt();
			
			if(parcelas == 3) {
				valorTotal = valorTotal / 3;
				
				
			}
		}
		
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("Tipo:" + );
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}

}
