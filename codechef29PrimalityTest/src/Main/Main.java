package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// System.out.println("aa");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scan.nextInt();
			int flag=0;
			if (n == 0 || n == 1)
				System.out.println("no");
			else {
				for (int i = 2; i < n / 2; i++) {

					if (n % i == 0) {
						System.out.println("no");
						flag=1;
						break;
					}

				}

			}
			if(flag==0)
				System.out.println("yes");
		}
	}
}