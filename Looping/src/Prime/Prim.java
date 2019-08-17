package Prime;

import java.util.Scanner;

public class Prim 
{
	public static void main(String[] args) {
		int i,num,temp1 = 0;
		System.out.println("Enter prime number limit");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		String Primeno ="";
		for (i = 0; i <= num; i++){
			for(num=i; num>=1;num++) {
				if(i%num==0){
					int temp = temp  +1;}
				else if(temp1==2) {
					Primeno = Primeno +i+ "";	
				}
				else {
				System.out.println("Number is prime : "+num);
			}
		}}
	}
}
