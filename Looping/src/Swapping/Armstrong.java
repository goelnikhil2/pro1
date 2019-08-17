package Swapping;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int a,b=0,c;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		c=temp;
		while(temp>0) {
			a=temp%10;
			b=(b)+(a*a*a);
			temp=temp/10;
		}
		if(c==b) {
			System.out.println(b+ ": No is Armstrong");
		}
		else {
			System.out.println("No Armstrong number");
		}
	}

}
