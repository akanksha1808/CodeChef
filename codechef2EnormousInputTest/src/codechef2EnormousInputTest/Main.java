package codechef2EnormousInputTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int x=scan.nextInt();
			
			if(x%k==0)
			{
			   count++;
			}
		}
		System.out.println(count);
	}

}

