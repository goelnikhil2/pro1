package Swapping;

import java.util.Scanner;

public class Palindrone {
	public static void main(String[] args) {
		int a,b = 0,temp;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		temp=num;
		while(num>0) {
			a=num%10;
			b=(b*10)+a;
			num=num/10;
		}
		if (temp == b) {
			System.out.println("No. is Palindrone");
		}
		else {
			System.out.println("No. is not Palindrone");
		}
	}

}
