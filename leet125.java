import java.util.Scanner;

class Solution{
	public static boolean isPalindrome( String s ){
		s = s.toLowerCase();

		for ( int i = 0 , j = s.length() - 1 ; i <= s.length()-1 ; i++ , j-- ){
			if( s.charAt( i ) < 'a' && s.charAt( i ) > 'z' )
				while( s.charAt( i ) >= 'a' && s.charAt( i ) <= 'z' )
					i++;

			System.out.print(s.charAt(i));
		}

		return true;
	}
}

public class leet125{
	public static void  main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println( Solution.isPalindrome( sc.nextLine() ) );
	}
}