package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("df");
		Scanner scan = new Scanner(System.in);
	    int n=scan.nextInt();
	    int x;
	    for(int i=0;i<n;i++)
	    {
	    	x=scan.nextInt();
	    	System.out.println(fact(x));
        }

	}

      static int fact(int x) {
		// TODO Auto-generated method stub
		if(x==0 || x==1)
			return 1;
    	 
		else
			return x*fact(x-1);
	}
}

