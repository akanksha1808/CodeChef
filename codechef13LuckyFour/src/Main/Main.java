package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
                //System.out.println("d");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
	 		int n = scan.nextInt();
                int a=0,c=0;
	 		while(n>0)
	 		{
	 			a=n%10;
	 			if(a==4)
	 			{
	 				c++;
	 			}
	 			n=n/10;
	 		}
             System.out.println(c);	 		
	 }
	}
}
							