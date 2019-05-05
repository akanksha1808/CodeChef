package Main;

import java.util.Scanner;
import java.util.Stack;
 
public class Main {
 
       public static void main(String[] args)
       {
              //System.out.println("aa");
              Scanner scan= new Scanner(System.in);
              int t=scan.nextInt();
              for(int j=0;j<t;j++)
              {
                 int n=scan.nextInt();
                 int m,a,sum=0;
                 m=n;
                 while(n>0)
                 {
                	 a = n%10;
                	 sum =sum*10 +a;
                	 n=n/10;
                	 
                 }
              if(m==sum)   
            	  System.out.println("wins");
              else
            	  System.out.println("losses");
              }
              }
}