package Pattern;

public class Pattern2 {
	public static void main(String[] args) {
		int i,j;
		for(i='A';i<='F';i++) {
			for(j='A';j<=i;j++) {
				System.out.print(" " +(char)j);
			}
			System.out.println();
		}
	}
}
