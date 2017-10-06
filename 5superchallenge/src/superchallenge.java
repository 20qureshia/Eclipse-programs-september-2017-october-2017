import java.util.Scanner;

public class superchallenge {
//use a sequence that approximates pi, other than Gregories series.
	public static void main(String [] args) {
		
		//using golden ratio
		// pi = 3+(1/(4*5*3))*(8+(2*3)/(7*8*3)*(13 + (3*5)/(10*11*3) *...
		//patterns noticed:
		// the number being added increases by five each sequence
		//the numerator of the fractions increases both factors by one each sequence
		//the denominator of the fractions increases the first two factors by three each sequence, but the third factor is always three.
		
		double x = 3; //constant for the sequences
		double pi = 0; // value of the variable pi.
		System.out.println("This program uses the golden ratio to approximate pi\nenter an integer to calculate the number of sequences.\n \ninput:");
		System.out.print("");
		Scanner ns = new Scanner(System.in);
		int n = ns.nextInt();
		int y = 1;
		int g = 1;
		int o = 4;
		int u = 5;
		int k = n;
		int r = 3;
		int count = 0;
		
		while (n>0) {
			if (k == n) {
				pi = pi + (r+(y * g)/(o*u*x));
				n--;
				count++;
				y++;
				g+=2;
				o+=3;
				u+=3;
				r+=5;
		}
			else if (count % 2 != 0) {
				pi = pi * (r+(y * g)/(o*u*x));
				n--;
				count++;
				y++;
				g+=2;
				o+=3;
				u+=3;
				r+=5;
			}
			else if (count % 2 == 0) {
				pi = pi * (r+(y * g)/(o*u*x));
				n--;
				count++;
				y++;
				g+=2;
				o+=3;
				u+=3;
				r+=5;
			}
	}
		System.out.println(pi);
	}
	}
