package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String str=scan.next();
			if(str.equalsIgnoreCase("B"))
			{
				System.out.println("BattleShip");
			}
			else if(str.equalsIgnoreCase("C"))
			{
				System.out.println("Cruiser");
			}
			else if(str.equalsIgnoreCase("D"))
			{
				System.out.println("Destroyer");
			}
			else if(str.equalsIgnoreCase("F"))
			{
				System.out.println("Frigate");
			}
		}	
 	
	}
	
	

}

