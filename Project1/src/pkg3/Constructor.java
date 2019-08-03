package pkg3;

public class Constructor {
	int a,b,c,d,e;
	public Constructor() {
		this(4,5,6,5);
	//	this(5);
		System.out.println("Default Constructor");
	}
	public Constructor(int a) {
	//	this(2,3,34);
		this();
		System.out.println("One Constructor");
	}
	public Constructor(int a,int b) {
		this(6,7,8);
		System.out.println("Two Constructor");
	}
	public Constructor(int a , int b, int c) {
		this(2);
	//	this(4,5,6,7);
		System.out.println("Three Constructor");
	}
	public Constructor(int a,int b,int c,int d) {
	//	this(4,5,6,7);
		System.out.println("Four Constructor");
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor(2,4);
		System.out.println("hello");
	}
}
