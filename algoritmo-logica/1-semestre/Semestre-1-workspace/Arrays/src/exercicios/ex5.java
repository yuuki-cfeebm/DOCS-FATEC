package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int[] nums = new int[50];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = 101 + i;
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);			
		}

	}

}
