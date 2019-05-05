	package Main;
	
	import java.util.Scanner;
	
	public class Main
	{
		public static void main(String[] args)
		{
			
			Scanner scan=new Scanner(System.in);
			int t=scan.nextInt();
			for(int i=0; i<t ; i++)
			{
	             int n=scan.nextInt();
	             int max=0,b=0;
	                for(int j=2 ; j<=n ; j++)
	                {   
	                	int rem= n%j;
	                	if(max<=rem)
	                	{
	                		max=rem;
	                		b=j;
	                	}
	                	
	                }
			      System.out.println(b);
		  	
		   }
		}
				
	}