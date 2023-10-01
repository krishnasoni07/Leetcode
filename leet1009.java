// Program to convert a number to another number through replacing it's binary digits with :-

//  Number		Binary		Converted Binary		ResultNumber
//	5		  101			010			   	2



import java.util.*;
import java.lang.Math;


public class leet1009{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int ans = 0;
		int cnt=0;
		do{
			if((num & 1) != 1){
				ans += (int)Math.pow(2,cnt);
			}
			num = num >>1;
			cnt++;
		}while(num != 0);

		System.out.println(ans);
	}
}