package pkg2;

public class Parent {

	public Parent() {
		this(6,8);
		System.out.println("Default parent");
	}
	public Parent(int a) {
		this();
		System.out.println("First parent");
	}
	public Parent(int a, int b) {
		
		System.out.println("Second parent");
	}
}
