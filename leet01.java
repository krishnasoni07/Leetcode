//Program to get the two indexes number which are equivalent to a given number
import java.util.Scanner;

class Solution{
	public static void printIndexesOfEquivalentSum(int[] a, int num){

		for(int i = 0; i < a.length;i++)
			for(int j = i + 1; j < a.length;j++)
				if(num == (a[i] + a[j]) )
					System.out.println("[" + i + "," + j + "]");

	}
}


public class leet01{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a[] = new int[sc.nextInt()];

		for(int i = 0;i<a.length;i++)
			a[i] = sc.nextInt();

		Solution.printIndexesOfEquivalentSum(a , sc.nextInt());
	}
}