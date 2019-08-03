package Inheritence;

public class op2 extends Father{
	public void Son2() {
		System.out.println("Son2_Turn with Father");
	}
	public static void main(String[] args) {
		op2 ob = new op2();
		ob.Son2();
		ob.second();
	}
}
