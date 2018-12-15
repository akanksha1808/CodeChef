package codechef1;

import java.util.Scanner;

public class codechef1 {

	//int initialBal=0;
	//int amountWithdraw;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
	
		 float x=scan.nextFloat();
		 float y=scan.nextFloat();
		 
			//float w= ((x % 5) !=0);
			//System.out.println();
		 if(((x%5)!=0) ||(x>y))
		 {
			 System.out.printf(" %.2f ",y);
		 }
		 else 
			 System.out.printf("%.2f",y-x-0.5);
		 
		

	}

}
