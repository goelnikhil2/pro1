package Swapping;

public class Withoutc {
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=9;
		System.out.println("before "+a +" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after "+a +" "+b);
		
	}
}
