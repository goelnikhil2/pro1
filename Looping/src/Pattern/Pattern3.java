package Pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int i,j,a=0,num=10;
		for(i=num;i>=1;i--,a=0) {
//		for(i=1;i<=num;++i,a=0) {
			for(j=1;j<=num-i;++j) {
				System.out.print("  ");
			}
			while(a != 2 * i-1) {
				System.out.print("* ");
				++a;
			}
			System.out.println();
		}
	}

}
