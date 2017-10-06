import java.util.Scanner; //inputs scanner
//this simple project uses gregory series to approximate pi 
public class challenge1 {
	public static void main(String [] args) {
		double x = 4;
		double y = 1;
		double c = 0;
		double pi = 0;
		System.out.println("Give the Gregory series a value \nIf n is entered, the sum of the first n\nterms of the Gregory series will be printed.\n \n \ninput:");
		System.out.print("");
		Scanner ns = new Scanner(System.in); //defines variable n as input through scanner
		double n = ns.nextDouble();
		//int n = (int)(Math.random() * 100000000)+20; // random number generator ranging from 20 to 10000000
		double k = n;
		double count = 0;

		while (n > 0) {

			if (k - n == 0) {
				c = y + 2*(k - n); 
				pi = pi +((x)/c);
				n--;
				count++;
			}

			else if((count) % 2 != 0) {
				c = y + 2*(k - n); 
				pi = pi - ((x)/c);
				n--;
				count++;
			}
			else if((count) % 2 == 0) {
				c = y + 2*(k - n); 
				pi = pi + ((x)/c);
				n--;
				count++;

			}

		}
		System.out.println("The sum of the first " + k +" terms of the Gregory series is \n" + pi);
	}
}
