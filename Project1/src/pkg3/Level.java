package pkg3;

import java.io.InputStream;
import java.util.Scanner;

import pkg2.Two;

public class Level {
	
	public int sum(int a, int b) {
		int c;
		c= a+b;
		return c;
	}
	public int sub(int a, int b) {
		int c;
		c= a-b;
		return c;
	}
	public int mul(int a, int b) {
		int c;
		c= a*b;
		return c;
	}
	public void div(int a, int b) {
		int c;
		c= a/b;
		System.out.println("Div = "+c);
	}
	public static void main(String[] args) {
		int v1,v2,v3,v4,v5,v6;
		Level obj = new Level();
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Please enter the input values");
		v1 = obj1.nextInt();
		v2 = obj1.nextInt();
		v3 = obj1.nextInt();
		v4 = obj1.nextInt();
		v5 = obj1.nextInt();
		v6 = obj1.nextInt();
		int add = obj.sum(v1,v2);
		int minus = obj.sub(add,v3);
		int add1 = obj.sum(minus,v4);
		int multiply = obj.mul(add1,v5);
		obj.div(multiply,v6);

	}

}
