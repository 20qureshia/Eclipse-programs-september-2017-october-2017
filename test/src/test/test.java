package test;

public class test {
	public static void main(String [] args) {
		int x = 4;
		int y = 3;
		int c = 0;
		double pi = 0;
		int n = (int)(Math.random() *30)+10;
		int k = n;
		
		pi = x - (Math.pow(x,3))/3;
		
		while (n > 0) {
			
			if((n-1) % 2 != 0) {
				n--;
				c = y + 2*(k - n); //makes variable c into value of 3 + 2 times the difference of k and n.
				pi = pi +(Math.pow(x,c)/c);
			}
			else if((n-1) % 2 == 0) {
				n--;
				c = y + 2*(k - n); //makes variable c into value of 3 + 2 times the difference of k and n.
				pi = pi -(Math.pow(x, c)/c);
			}
			
		}
		System.out.println(pi);
	}
}



