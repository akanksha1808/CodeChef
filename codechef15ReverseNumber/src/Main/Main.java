package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
                System.out.println("d");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int i = 0; i < t; i++) {
			int m=0,b=0,c=0,a=0,p=0;
			int n = scan.nextInt();
	 		m=n;
	 		while(n>0)
 	 		{   
	 			n=n/10;
	 			c++;
	 		}
	 		//System.out.println(c);
	 		while(m>0)
	 		{
	 			a=m%10;
	 			p=pow(10,c);
	 			//System.out.println(p);
	 			b=m/p;
	 			break;
	 		}
	 		//System.out.println(a);
	 		System.out.println(a+b);
	 }
	}

	public static int pow(int i, int c) {
		// TODO Auto-generated method stub
		int p=1;
		while(c>1)
		{
			p = p * i;
			c--;
		}
		return p;
	}
}
  