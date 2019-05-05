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
                 int[] ar={1,2,5,10,50,100};
                 int l=ar.length;
                 int n=scan.nextInt();
                 int c=0;
                 for(int i=l-1;i>=0;i--)
                 {
                	 while(n>0 && (n/ar[i]>0))
                	 {
                		 c += n/ar[i];
                		 n=n%ar[i];
                	 }
                 }
                 System.out.println(c);
              }
        }
}