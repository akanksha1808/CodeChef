package Main;

import java.util.Scanner;
import java.util.Stack;
 
public class Main {
 
       public static void main(String[] args)
       {
              //System.out.println("aa");
              Scanner scan= new Scanner(System.in);
              int t=scan.nextInt();
              for(int i=0;i<t;i++)
              {
            	Stack<Character> operators= new Stack<>();
            	Stack<Character> brackets= new Stack<>();
            	String infix=scan.next();
            	String postfix="";
            	int l=infix.length();
            	for(int j=0;j<l;j++)
            	{
            		char ch=infix.charAt(j);
            		if(ch == '+' || ch == '-' || ch == '*' || ch=='/' || ch =='^')
                          operators.push(ch);
            		else if(ch=='(')
            			brackets.push(ch);
            		else if(ch==')')
            		{
            			brackets.pop();
            			if(!operators.isEmpty())
            			{
            				postfix += operators.pop();
            			}
            		}
            		else{
            			postfix += ch;
            			if(!operators.isEmpty())
            			{
            				postfix += operators.pop();
            			}
            	 }
            	}
            	  System.out.println(postfix);
              }
            }
}