package pkg2;

public class Two {
	
	public int sum(int a, int b) {
		int c;
		c= a+b;
		System.out.println("Sum = "+c);
		return c;
	}
	public int sub(int a, int b) {
		int c;
		c= a-b;
		System.out.println("Sub = "+c);
		return c;
	}
	public int mul(int a, int b) {
		int c;
		c= a+b;
		System.out.println("Mul = "+c);
		return c;
	}
	public void div(int a, int b) {
		int c;
		c= a+b;
		System.out.println("Div = "+c);
	}
	public static void main(String[] args) {
		Two nik = new Two();
		int add = nik.sum(10,2);
		int minus = nik.sub(add, 2);
		int add1 = nik.sum(minus,2);
		int multiply = nik.mul(add1, 2);
		nik.div(multiply, 2);
			
	}

}
