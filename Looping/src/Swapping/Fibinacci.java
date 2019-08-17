package Swapping;

public class Fibinacci {
	public static void main(String[] args) {
		int i,a=0,b=1,d=9;
		System.out.print("Fibonacci Series : ");
		for(i=0;i<=d;i++) {
			System.out.print(a+" ");
			int sum = a+b;
			a=b;
			b=sum;
		}
	}	

}
