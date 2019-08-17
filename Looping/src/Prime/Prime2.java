package Prime;

import java.util.Scanner;

public class Prime2 {
	public static void main(String[] args) {
		int i;
		System.out.print("Enter 1st number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		for(i=0;i<=num/2;i++) {
			for(i=0;i<=num1/2;i++) {
				if((num%2==0) && (num1%2==1)) {
					System.out.println("Number is not prime");
					break;
				}
				else {
					System.out.println("Number is Prime");
					break;
				}
//				else {
	//				System.out.println("Invalid input");
				}
			}
		}
	}
//}
