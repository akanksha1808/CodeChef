			package Main;
				
				import java.util.Scanner;
				
				public class Main {
					
					public static void main(String[] args) {
						// TODO Auto-generated method stub
						Scanner scan= new Scanner(System.in);
					    System.out.println("x"); 
                          int n=scan.nextInt();
                          int max,min=0;
                          for(int i=0;i<n;i++)
                          {
                        	  int a=scan.nextInt();
                        	  int b=scan.nextInt();
                        	  min=a>b? a:b;
                        	  max=a+b;
                        	  System.out.println(min + " " +max);
                          }
					
					
					}
				}