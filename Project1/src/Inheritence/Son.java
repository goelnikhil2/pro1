package Inheritence;

public class Son extends Father{
	public void Third() {
		System.out.println("Son_turn");
	}
	public static void main(String[] args) {
		Son obj = new Son();
		obj.First();
		obj.second();
		obj.Third();
	}
}
