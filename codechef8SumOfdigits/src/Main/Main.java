package Main;

import java.util.Scanner;

public class Main
{
	/**
	 * @param args
	 */
	public static void main(String... args)
	{
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0; i<t ; i++)
		{
               int n=scan.nextInt();
               int a=0, sum=0;
               while(n>0)
               {
            	   a=n%10;
            	   sum += a;
            	   n=n/10;
               }
			
 			System.out.println(sum);
		}
		
	}
	


}