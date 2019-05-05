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
                int a=scan.nextInt();

                int b=scan.nextInt();

                int c=scan.nextInt();
              
                if(a+b+c==180)
                	System.out.println("YES");
                else
                	System.out.println("NO");
              }
        }
}