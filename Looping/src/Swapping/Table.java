package Swapping;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		int i,n;
		System.out.println("Enter value for table");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Entered value : " +n);
		for(i=0;i<=10;i++) {
			System.out.println(n+" X "+i+ " = "+ (n*i));
		}
	}
}
