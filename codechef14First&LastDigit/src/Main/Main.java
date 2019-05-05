package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("d");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
            int sum=0,a=0;
			int n = scan.nextInt();
			while(n>0)
			{
				a=n%10;
				sum =sum*10+a;
				n=n/10;
			}
            System.out.println(sum);
		}
	}
}