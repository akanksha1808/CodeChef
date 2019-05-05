package codechef2EnormousInputTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0; i<t;i++)
		{
			int r=scan.nextInt();
		    int x1=scan.nextInt();
		    int y1=scan.nextInt();
		    int x2=scan.nextInt();
		    int y2=scan.nextInt();
		    int x3=scan.nextInt();
		    int y3=scan.nextInt();
		    double d1=Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		    double d2=Math.sqrt((Math.pow((x3-x2),2)+Math.pow((y3-y2),2)));
		    double d3=Math.sqrt((Math.pow((x3-x1),2)+Math.pow((y3-y1),2)));
				if(d1<=r && d2<=r || d2<=r && d3<=r ||d1<=r && d3<r )
					System.out.println("yes");
				else
					System.out.println("no");
 		
		}
	}

}

