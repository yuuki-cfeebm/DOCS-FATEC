package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int[] nums = new int[5];
		
		//usuario digita valores
		for(int i=0; i < nums.length; i++) {
			System.out.println("Digite um número: ");
			nums[i] = ent.nextInt();
		}
		
		//array invertido
		System.out.print("Array invertido: ");
		for(int i=(nums.length-1); i >= 0; i--) {
			System.out.print(nums[i]);
		}
	}

}
