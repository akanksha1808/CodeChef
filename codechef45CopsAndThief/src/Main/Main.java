package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 int t=scan.nextInt();
		  
		 while(t-->0)
		 {
			 int M=scan.nextInt();
			 int x=scan.nextInt();
			 int y=scan.nextInt();
			 int a[]=new int[M];
			 int b[]=new int[101];
			 int pro=x*y;
			 int start,end;
			 for(int i=0;i<M;i++)
			 {
				 a[i]=scan.nextInt();
				 if(a[i]-pro<=0)
					 start=1;
				 else
					 start=a[i]-pro;
				 if(a[i]+pro>=100)
					 end=100;
				 else
					 end=a[i]+pro;
				 
				 for(int j=start;j<=end;j++)
					 b[j]=1;
			 }
			 int count=0;
			 for(int j=1;j<=100;j++)
			 {
				 if(b[j]!=1)
					 count++;
			 }
			 System.out.println(count);
		 }

		
		
		
		
	}
}

