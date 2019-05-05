package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
   //  System.out.println("sa");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t-- > 0) {
			int n = scan.nextInt();
			long min = scan.nextLong();
			long cost = 0;

			for (int i = 1; i < n; i++) {
				long a = scan.nextLong();
				if (a < min)
					min = a;
			}
			cost = min * (n - 1);

			System.out.println(cost);

		}

	}

}
