package codechef7LeadGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int p1 = 0,p2 = 0,winner,lead=0;
		int maxlead = 0,fwinner=0;
		for(int i=0; i<n ; i++)
		{
			p1 += scan.nextInt();
			p2 += scan.nextInt();
			
			winner=p1>p2? 1: 2;
			
			lead=p1>p2 ? p1-p2 : p2-p1;
			
			if(maxlead<lead)
				
			{
			   maxlead=lead;
			   fwinner=winner;
			   
				
			}
			
		}

		      System.out.println(fwinner + " " + maxlead);
	}

}
