//INC...

import java.util.Scanner;

public class leet1456{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println(maxVowels(sc.next(),sc.nextInt()));
	}

	static int maxVowels(String s , int k){
		int max = 0;

		for(Byte i = 0; i < s.length() - (k -1); i++){
			int cnt = 0;		
			for(int j = i; j < i + k; j++)
				cnt += (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u')?1:0;
			if(cnt > max){
				if(cnt == k)
					return k;
				max = cnt;
			}
		}
		return max;
	}
	
}

