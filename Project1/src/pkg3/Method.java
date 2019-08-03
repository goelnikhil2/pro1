package pkg3;

public class Method {
	
	public void method0() {
		this.method2();
		System.out.println("Default method");
	}
	public void method1() {
		this.method0();
		System.out.println("One parameterized method");
	}
	public void method2(){
		System.out.println("Two parameterized method");
	}
	public void method3() {
		this.method1();
		System.out.println("Three parameterized method");
	}
	public static void main(String[] args) {
		Method obj = new Method();
		obj.method3();
	}
}
