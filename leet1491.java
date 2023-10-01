// Program to get average of elements of a array without minimum and maximum value 
// 	of the array

import java.util.Scanner;

public class leet1491{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[sc.nextInt()];

		for(int i = 0;i<a.length;i++)
			a[i] = sc.nextInt();
		System.out.println(average(a));
	}

	static double average(int[] salary){
		double ans = 0;
		int max = 0, min = 0;

		for(int i = 0 ; i < salary.length; i++){
			ans += salary[i];
			if( i == 0) min = max = salary[i];
			else{
				if(min > salary[i]) min = salary[i];
				if(max < salary[i]) max = salary[i];
			}
		}
		ans = ((ans - (min + max)) / (salary.length - 2));
		return ans;
	}
}