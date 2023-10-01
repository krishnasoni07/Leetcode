// Program to find londest common prefix from a string array

import java.util.Scanner;

class string{
	public static String longestCommonPrefix(String[] str){
		String ans = "";

		for(int i = 0 ; i < str[0].length() ; i++){
			for(int j = 1 ; j < str.length; j++ ){
				if( i < str[j].length() ){
					if( str[0].charAt(i) != str[j].charAt(i) ){
						return ans;
					}
				}
				else return ans;
			}
			ans += str[0].charAt(i);
		}
		return ans;
	}

}

public class leet14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String str[] = new String[sc.nextInt()];

		for(int i = 0; i < str.length;i++)
			str[i] = sc.next();

		System.out.println( string.longestCommonPrefix(str) );
	}
}