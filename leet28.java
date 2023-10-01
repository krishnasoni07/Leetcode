// Program to return first occurance of an string in another string

import java.util.Scanner;

class Solution{
	public static int strStr(String haystack , String needle ) {
		return haystack.indexOf(needle);
	}
}

public class leet28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println(Solution.strStr( sc.next() , sc.next() ) );
	}
}