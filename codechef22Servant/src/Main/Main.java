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
	    	if(x<10)
	    		System.out.println("What an obedient servant you are!");
	    	else
	    		System.out.println("-1");

       }
	}
}

