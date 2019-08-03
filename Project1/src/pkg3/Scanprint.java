package pkg3;

import java.util.Scanner;

public class Scanprint {
	public void add() {
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter input values");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition in method = "+c);
	}
	public void minus() {
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter input values");
		a=s.nextInt();
		b=s.nextInt();
		c=a-b;
		System.out.println("Subtraction in method = "+c);
	}
	public void multiply() {
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter input values");
		a=s.nextInt();
		b=s.nextInt();
		c=a*b;
		System.out.println("Multition in method = "+c);
	}
	public void div() {
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter input values");
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println("Division in method = "+c);
	}
	public void modulas() {
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter input values");
		a=s.nextInt();
		b=s.nextInt();
		float c=s.nextFloat();		
		float d=a+b%c;
		System.out.println("Modulas in method = "+d);
	}
	public static void main(String[] args) {
		Scanprint obj = new Scanprint();
		obj.add();
		obj.minus();
		obj.multiply();
		obj.div();
		obj.modulas();
	}
}
