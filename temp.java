import java.util.Scanner;

class Solution{
	public static void print(int a[] , int sum){
		for(int i = 0 ; i < a.length;i++)
			for( int j = i + 1; j < a.length;j++)
				if( sum == a[i] + a[j] ){
					System.out.println(i + " " + j);
					return;
				}
	}
}

public class temp{
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);

		int a[] = new int[ sc.nextInt() ];

		for(int i = 0; i < a.length;i++) a[i] = sc.nextInt();

		Solution.print( a , sc.nextInt() );
	}
}