package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("jh");
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		while(t-->0)
		{
			
			int n=s.nextInt();
			int sum=0;
		    int c=0;
		 
		    
		    	for(int i=1;i<=n;i++)
		    	{
		    	
		    		sum=sum+i;
		    		if(sum<=n)
		    			c++;
		    		
		    	}
		    
		    	System.out.println(c);
		    }
		}
		
	}

