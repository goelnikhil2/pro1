package pkg1;

public class Ram {
	public Ram() {
		this(6,8,8);
		System.out.println("Default parent");
	}
	public Ram(int a) {
		this(4,7);
		System.out.println("First parent");
	}
	public Ram(int a, int b) {
		this();
		System.out.println("Second parent");
	}
	public Ram(int a, int b, int c) {
		
		System.out.println("Third parent");
	}
}
