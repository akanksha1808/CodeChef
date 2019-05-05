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
	      int a=scan.nextInt();
	      int b=scan.nextInt();
	      int c=scan.nextInt();
	       x=(a+b+c)-(a>b && a>c ? a: b>c && b>a ? b :c)-(a<b && a<c ? a: b<c && b<a ? b :c);
	       System.out.println(x);
	      
	    }
	    	
	
	}

	}


