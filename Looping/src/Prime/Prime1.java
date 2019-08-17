package Prime;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		int i,temp=0;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(i=2;i<=num;i++) {
			if(num%2==0) {
				System.out.println("Number is not prime");
				temp =1;
				break;
			}
			if(temp==0) {
				System.out.println("Number is Prime");
				break;
			}
		}
	}
}
