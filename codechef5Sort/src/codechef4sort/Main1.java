	package codechef4sort;
	
	
	import java.util.Scanner;
	
	public class Main1 {
	
	  void sort(int arr[])
	  {
		  int n=arr.length;
		  for(int i=1;i<n;i++)
		  {
			  
			  int key=arr[i];
			  int j=i-1;
			  
			  while(j>=0 && arr[j]>key)
			  {
				  arr[j+1]=arr[j];
				  j=j-1;
				  
			}
			  arr[j+1]=key;
			  
		  }
		  
		  for(int i=0;i<n; i++)
		  {
			  System.out.println(arr[i]);
		  }
		  
	  }
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner scan=new Scanner(System.in);
			 int t=scan.nextInt();
			 int arr[]=new int[t];
			 for(int i=0;i<t;i++)
			 {
				 int k=scan.nextInt();
				  arr[i] = k;
			 }
		         Main1 m=new Main1();	 
			      m.sort(arr);
			 
		   }
	
	}

	
	
	
	
	
//	
//	import java.io.BufferedReader;
//	import java.io.IOException;
//	import java.io.InputStreamReader;
//	import java.util.ArrayList;
//	import java.util.Collections;
//	import java.util.List;
//	class TSORT {
//		public static void main(String[] args) throws NumberFormatException, IOException {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			int n = Integer.parseInt(br.readLine());
//			List<Integer> list = new ArrayList<>();
//			while (n-- != 0)
//				list.add(Integer.parseInt(br.readLine()));
//			Collections.sort(list);
//			for (int i = 0; i < list.size(); i++)
//				System.out.println(list.get(i));
//		}
//	} 
