package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] a;

		int[] b;

		int flag = 0;

		while (true) {

			int n = scan.nextInt();

			if (n == 0)

				return;

			else {

				a = new int[n];

				b = new int[n];

				for (int i = 0; i < n; i++) {

					a[i] = scan.nextInt();

				}

				for (int j = 0; j < n; j++) {

					int x = 0, y = 0;

					x = a[j];

					y = a[x - 1];

					b[y - 1] = x;

				}


				for (int i = 0; i < n ; i++)

				{

					if (a[i] != b[i])
					{
						flag = 1;
                          break;

					}
				}

				if (flag == 0)

					System.out.println("ambiguous");

				else

					System.out.println("not ambiguous");

			}

		}

	}

}
