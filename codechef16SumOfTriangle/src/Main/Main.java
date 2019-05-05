package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// System.out.println("d");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int a[][] = new int[n][n];

			for (int j = 0; j < n; j++) {
				for (int k = 0; k <= j; k++) {

					a[j][k] = scan.nextInt();

				}
			}	
			
             for(int j=n-2; j>=0;j--)
             {
            	 for(int k=0;k<=j;k++)
            	 {
            		 a[j][k]=a[j][k]+max(a[j+1][k],a[j+1][k+1]);
            	 }
             }
             System.out.println(a[0][0]);
		}
	}

	public static int max(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
}

