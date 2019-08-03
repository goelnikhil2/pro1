package pkg1;

public class One {
	
	int age;
	int roll_no;

	public void Display1() {
		System.out.println("Hello World");
	}
	
	public void Display2() {
		System.out.println("Welcome to Java");
	}
	public static void main(String[] args) {
		One nik = new One();
		nik.Display1();
		nik.age=20;
		nik.roll_no=30;
		System.out.println("Age "+nik.age);
		System.out.println("Roll_No = "+nik.roll_no);
		
		nik.Display2();
		nik.age=30;
		nik.roll_no=40;
		System.out.println("Age "+nik.age);
		System.out.println("Roll_No = "+nik.roll_no);
		
	}
	

}
