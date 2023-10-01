// Program to get the peak of a mountain array.
// Mountain Array : - 
// 			1_7_6_5_4_3
//
// Approach used :- 
//			i had used Binary search algo in it, 
//			as if my mid element is greater than mid + 1 and mid - 1, than i will return my mid index			| It means that i have found my peak index as it is higher than both sides
//			else if my mid element is less than my mid - 1 element , than i will update my end to end = mid		| It means that there is a higher peak than my current peak in the left side
//			else if my mid element is less than my mid + 1 element , than i will update my start to start = mid + 1	| It means that there is a higher peak than my current peak in the right side

import java.util.Scanner;

class Solution {
	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0 , end = arr.length-1;
		int mid = start + (end - start) / 2;

		while(start <= end){
			if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
			else if(arr[mid] < arr[mid + 1]) start = mid + 1;
			else if (arr[mid]  < arr[mid - 1]) end = mid;

			mid = start + (end - start) / 2;
		}
		return -1;
	}
}

public class leet852{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a[] = new int[sc.nextInt()];

		for(int i = 0 ;i < a.length ; i++) a[i] = sc.nextInt();


		System.out.println(Solution.peakIndexInMountainArray(a));
	}
}