package pkg2;

public class Child extends Parent{
	public Child() {
		this(5);
		System.out.println("Default Child");
	}
	public Child(int a) {
		super(9);
		System.out.println("First Child");
	}
	public Child(int a, int b) {
		this();
		System.out.println("Second Child");
	}
	public static void main(String[] args) {
		Child obj = new Child(4,7);
	}

}
