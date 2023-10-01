import java.util.Scanner;

class Solution{
	public static int searchInsertPosition(int a[] , int num){
		int s = 0;
		int e = a.length - 1;
		int mid = s + (e - s) / 2;
		
		return 0;
	}
}

public class leet35{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[sc.nextInt()];

		for(int i = 0; i < a.length;i++) a[i] = sc.nextInt();

		System.out.println( Solution.searchInsertPosition(a , sc.nextInt() ));
	}
}