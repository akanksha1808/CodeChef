package codechef4SmallFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Main2{

	
	static BigInteger factorial(int n)
	
	{
		BigInteger b=new BigInteger("1");
		
		for(int i =2;i<=n ;i++)
			b=b.multiply(BigInteger.valueOf(i));
			
           return b;		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan =new Scanner(System.in);
       int t=scan.nextInt();
       for(int i=0; i<t;i++)
       {
       int n=scan.nextInt();
       System.out.println(factorial(n));
	   }
	}
}
