package Inheritence;

public class op1 extends Father{
	public void Son1() {
		System.out.println("Son1_Turn with Father");
	}
	public static void main(String[] args) {
		op1 ob = new op1();
		ob.Son1();
		ob.second();
	}
}
