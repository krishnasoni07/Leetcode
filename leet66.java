import java.util.Scanner;

public class leet66{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[ sc.nextInt() ];

		for(int i = 0 ; i < a.length ; i++ ) a[i] = sc.nextInt();

		a = plusOne(a);

		for(int i = 0 ; i < a.length ; i++ ) System.out.print(a[i] + " " );
	}

	static int[] plusOne(int[] a){
		int ans[] = new int[a.length + 1];
		for(int i = 0 ; i < ans.length ; i++ ) System.out.print(ans[i] + " " );

		return a;
	}
}