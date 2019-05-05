package Main;

import java.util.Scanner;
 
public class Main {
 
       public static void main(String[] args)
       {
              //System.out.println("aa");
              Scanner scan= new Scanner(System.in);
              int t=scan.nextInt();
              for(int i=0;i<t;i++)
              {
                     int n= scan.nextInt();
                     int a[]=new int[n];
                     for(int j=0;j<n;j++)
                     {
                           a[j]=scan.nextInt();
                     }
                     int x=a[0];
                     for(int j=1;j<n;j++)
                     {
                           x=gcd(x,a[j]);
                     }
                     //System.out.println(x);
                     for(int j=0;j<n;j++)
                     {
                           System.out.print(a[j]/x + " ");
                     }
                     System.out.println();
                    
              }
       }
 
       static int gcd(int i, int j) {
              // TODO Auto-generated method stub
            if(j==0)
               return i;
             
               return gcd(j,i%j);
       }
}