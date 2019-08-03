package pkg3;

public class Constructor1 {
	
	int a,b,c,d,e;
	public void Constructor1() {
	//	this(4,5);
	//	this(5);
		System.out.println("Default method");
	}
	public int Constructor1(int a) {
		this();
	//	this(2,3,34);
		System.out.println("One method");
	}
	public int Constructor1(int a,int b) {
		this(6,7,8);
		System.out.println("Two method");
	}
	public int Constructor1(int a , int b, int c) {
		this(2);
	//	this(4,5,6,7);
		System.out.println("Three method");
	}
	public static void main(String[] args) {
		Constructor1 obj = new Constructor1(2,4,7,9);
		System.out.println("hello");
	}

}
