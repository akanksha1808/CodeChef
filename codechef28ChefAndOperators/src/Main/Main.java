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

                if(a>b)
                	System.out.println(">");
                else if(a<b)
                	System.out.println("<");
                else System.out.println("=");
               }
        }
}