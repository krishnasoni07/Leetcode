// Program to find missing number from a array containing n elements.

import java.util.Scanner;

public class leet268{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a[] = new int[sc.nextInt()];

		for(int i = 0;i<a.length;i++)
			a[i] = sc.nextInt();

		System.out.println(missingNumber(a));
	}

	static int missingNumber(int[] nums) {
		int k = 0 ,sum=0;
		for(int i = 1; i <= nums.length;i++){
			k += i;
			sum += nums[i-1];
		}

		return k - sum;
	}
}