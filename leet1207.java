import java.util.Scanner;

public class leet1207{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[sc.nextInt()];

		for(int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		System.out.println(uniqueOccurrences(a));
	}

	static boolean uniqueOccurrences(int[] a){
		int ans = 0;

		for(int i = 0; i < a.length; i++)
			ans = ans ^ a[i];

		if(ans == 0)
			return false;	
		return true;
	}
}