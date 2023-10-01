import java.util.*;
import java.lang.Math;


public class leet07{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int ans = 0;
		int cnt=0;
		while(num != 0){
			if((num & 1) != 1){
				ans += (int)Math.pow(2,cnt);
			}
			num = num >>1;
			cnt++;
		}

		System.out.println(ans);
	}
}