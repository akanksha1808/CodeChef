			package codechef1ATM;
				
				import java.util.Scanner;
				
				public class Main {
					
					public static void main(String[] args) {
						// TODO Auto-generated method stub
						Scanner scan= new Scanner(System.in);
					
						 float x=scan.nextFloat();
						 float y=scan.nextFloat();
						 
						 if(((x%5)==0) && y-0.5>x)
						 {
							 System.out.printf(" %.2f ",y-x-0.5);
						 }
						 else 
							 System.out.printf("%.2f",y);
						 
						
				
					}
				
				}
