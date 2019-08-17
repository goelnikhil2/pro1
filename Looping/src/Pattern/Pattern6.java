package Pattern;

public class Pattern6 {
	public static void main(String[] args) {
		for(int i=6;i>=i;i--) {
			for(int j=6-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}