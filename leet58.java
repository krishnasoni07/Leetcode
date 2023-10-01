// Program to get length of last word in a string excluding white spaces.

import java.util.Scanner;

class Solution{
	public static int lengthOfLastWord( String s ){
		for(int i = s.length() - 1; i >= 0 ; i-- ){
			if(s.charAt(i) == ' ') continue;
			else{
				String str = s.substring(0 , i + 1);
				if(str.lastIndexOf(' ') != -1 ) 
					return (str.length() - 1) - str.lastIndexOf(' ');
				else return str.length();
			}
		}
		return 0;
	}
}

public class leet58{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println( Solution.lengthOfLastWord( sc.nextLine() ) );
	}
}