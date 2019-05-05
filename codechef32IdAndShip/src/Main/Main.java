package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
         for(int i=0;i<t;i++)
         {
        	 int ans=0;
           int n=scan.nextInt();
           while(n>2)
           {
        	   ans += (n-2)/2;
        	   n=n-2;
           }
           System.out.println(ans);
         }
         
	
	}
 }

