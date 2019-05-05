			package Main;
				
				import java.util.Scanner;
				
				public class Main {
					
					public static void main(String[] args) {
						// TODO Auto-generated method stub
						Scanner scan= new Scanner(System.in);
					    System.out.println("x"); 
						int n=scan.nextInt();
					      for(int i=0; i<n ; i++)
					      {
					    	  int x=scan.nextInt();
					    	  int y=squareRoot(x);
					    	  System.out.println(y);
					      }    
				
					}
				 public static int squareRoot(int x)
				 {
					 if(x==0)
						 return 0;
					 else if(x==1)
						 return 1;
					 else
					 {
						 int i=1,prod=1;
						 
							 while(prod<=x)
							 {
								 i++;
							  prod=i*i;
						     }
						 return i-1;
					 }
				 }
				}
