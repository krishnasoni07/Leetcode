import java.util.Scanner;

class Solution{
	public static int removeElement(int nums[] , int val ){
		int ans = nums.length;
		for( int i = 0 ; i < nums.length; i++)
			if( nums[i] == val ) ans--;
		return ans;
	}
}

public class leet27{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[sc.nextInt()];

		for(int i = 0;i<a.length;i++) a[i] = sc.nextInt();

		System.out.println( Solution.removeElement(a , sc.nextInt() ) );
	}
}