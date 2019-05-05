package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
             //   System.out.println("d");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int c = 0, a = 0;
			while (n > 2048) {
				n -= 2048;
				c++;
			}

			while (n > 0) {
				a = n % 2;
				if (a == 1) {
					c++;
				}
				n = n / 2;

			}
                  System.out.println(c);
     		}

	}

}
