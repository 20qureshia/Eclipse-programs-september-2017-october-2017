
public class greggySeries {
	public static void main(String [] args) {
		double x = 4;
		double y = 1;
		double c = 0;
		double pi = 0;
		int n = (int)(Math.random() * 100000000)+20;
		int k = n;
		double count = 0;
		
		while (n > 0) {
			
			if (k - n == 0) {
				c = y + 2*(k - n); //makes variable c into value of 3 + 2 times the difference of k and n.
				pi = pi +((x)/c);
				n--;
				count++;
			}
			
			else if((count) % 2 != 0) {
				c = y + 2*(k - n); //makes variable c into value of 3 + 2 times the difference of k and n.
				pi = pi - ((x)/c);
				n--;
				count++;
			}
			else if((count) % 2 == 0) {
				c = y + 2*(k - n); //makes variable c into value of 3 + 2 times the difference of k and n.
				pi = pi + ((x)/c);
				n--;
			count++;
			
		}
		
		}
		System.out.println("The sum of the first " + k +" terms of the Gregory series is \n" + pi);
	}
	}

