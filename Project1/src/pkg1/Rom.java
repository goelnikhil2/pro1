package pkg1;

public class Rom extends Ram{
	
	public Rom() {
		this(5,7);
		System.out.println("Default Child");
	}
	public Rom(int a) {
		this(9,9,8);
		System.out.println("First Child");
	}
	public Rom(int a, int b) {
		super(8);
		System.out.println("Second Child");
	}
	public Rom(int a, int b, int c) {
		this();
		System.out.println("Third Child");
	}
	public static void main(String[] args) {
		Rom obj = new Rom(4);
	}
}
