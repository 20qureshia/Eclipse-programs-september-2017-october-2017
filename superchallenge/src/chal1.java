import java.util.Scanner;

public class chal1 {
		public static void main(String [] args) {
			double x = 4;
			double y = 3;
			double c = 0;
			double pi = 0;
			double n = (double)(Math.random() *100)+10;
			double k = n;
			
			pi = x - (x^(3))/3;
			while (n > 0) {
				if((n-1) % 2 != 0) {
					n--;
					c = y + 2*(k - n); //makes variable c into value of 3 + 2 times the difference of k and n.
					pi = pi +((x^(c))/c);
				}
				else if((n-1) % 2 == 0) {
					n--;
					c = y + 2*(k - n); //makes variable c into value of 3 + 2 times the difference of k and n.
					pi = pi -((x^(c))/c);
				}
				
			}
			System.out.println(pi);
		}
	}



