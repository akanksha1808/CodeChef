package codechef2EnormousInputTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
        int even=0,odd=0;
        int[] ar=new int[t];
		for(int i=0;i<t;i++)
		{
			ar[i]=scan.nextInt();
		}
		for(int i=0;i<t;i++)
		{
			if(ar[i]%2==0)
				even++;
			else
				odd++;
		}
	
	    if(even>odd)
	    	System.out.println("READY FOR BATTLE");
	    	else
	    		System.out.println("NOT READY");
	
	}

}

