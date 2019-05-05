package codechef2EnormousInputTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
        for(int i=0;i<t;i++)
		{   int min=1000000,sum=0;
			int n=scan.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=scan.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				for(int k=j+1;k<n;k++) 
				{
					sum=a[j]+a[k];
					if(sum<min)
					{
						min=sum;
					}
				}
			
			}
			System.out.println(min);
			
		}
		}

}

