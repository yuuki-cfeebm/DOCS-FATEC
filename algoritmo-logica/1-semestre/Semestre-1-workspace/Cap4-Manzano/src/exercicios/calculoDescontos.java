package exercicios;

import java.util.Scanner;

public class calculoDescontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String nomeCliente = "";
		String parceria;
		char tipoCliente;
		
		double valorTotal, desconto, valorFinal, valorParcela=0;
		int parcelas=0;
		
		
		
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
		
		valorFinal = valorTotal - desconto;
		
		if(valorFinal > 500) {
			System.out.println("Digite a opção de parcelamento 3x sem juros ou 4x a 6x com juros de 18% sobre o total de parcelas:");
			parcelas = entrada.nextInt();
			
			switch(parcelas) {
			case 3:
				parcelas = 3;
				break;
			case 4:
				parcelas = 4;
				valorParcela = valorFinal / parcelas;
				valorParcela += valorParcela * 0.18;
				break;
			case 5: 
				parcelas = 5;
				valorParcela = valorFinal / parcelas;
				valorParcela += valorParcela * 0.18;
				break;
			case 6:
				parcelas = 6;
				valorParcela = valorFinal / parcelas;
				valorParcela += valorParcela * 0.18;
				break;
			}
			
		} else {
			parcelas = 0;
			valorParcela = 0;
		}
		
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("Tipo:" + parceria);
		System.out.println("Valor da compra: " + valorTotal);
		System.out.println("Desconto aplicado: " + desconto);
		System.out.println("Valor Final: " + valorFinal);
		System.out.println("Parcelamento em " +parcelas+ "x:");
		System.out.println("Valor das parcelas: R$ " + valorParcela);
		
	}

}
