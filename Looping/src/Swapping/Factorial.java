package Swapping;

import java.util.Scanner;

public class Factorial {
	private static Scanner sc;

	public static void main(String[] args) {
		int i,fact = 1;
		sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		for(i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.print("Factorial is for num "+num+ " : " +fact);
	}

}
