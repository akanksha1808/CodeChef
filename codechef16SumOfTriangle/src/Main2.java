import java.util.Scanner;

public class Main2


{


public static void main (String[] args) throws java.lang.Exception


{


Scanner sc=new Scanner(System.in);


int t=sc.nextInt();


while(t-- >0){


int ro=sc.nextInt();


int[][] arr=new int[ro][ro];


for(int i=0;i<ro;i++){


for(int j=0;j<=i;j++){


arr[i][j]=sc.nextInt();


}


}


for(int i=ro-2;i>=0;i--){


for(int j=0;j<=i;j++){


arr[i][j]+=max(arr[i+1][j],arr[i+1][j+1]);


}


}


System.out.println(arr[0][0]);


}


}


public static int max(int x,int y){


if(x>y)


return x;


else


return y;


}


} 
