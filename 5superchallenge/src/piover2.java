import java.util.Scanner;

public class piover2 {
	public static void main(String [] args) {
		double pi = 0;
		double x = 2;
		double y =2;
		Scanner ns = new Scanner(System.in);
		int n = ns.nextInt();
		int k = n;
		int count = 0;
		
		
		while (n>0) {
			if (k == n) {
			pi = pi + 2*(Math.pow(2, 0.5))/2;
			n--;
			count ++;
			}
			if (count %2 != 0) {
				pi = pi * ((Math.pow(, )))
			}
		}
		System.out.println(pi);
	}
}
