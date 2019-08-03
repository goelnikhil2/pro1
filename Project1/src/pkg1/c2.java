package pkg1;

public class c2 extends c1 {
	public void m1() {
		System.out.println("method 1");
	}
	public void nik() {
		System.out.println("Abstract method");
	}
	public static void main(String[] args) {
		c2 obj = new c2();
		obj.m1();
		obj.nik();
		obj.m2();
	}
}
