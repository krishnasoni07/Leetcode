// Program to get two binary strings and return addition of those string in another
//	binary string
//

import java.util.Scanner;

public class leet67{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(addBinary(sc.next() , sc.next() ));
	}


	static String addBinary(String s1 , String s2){
		StringBuilder ans = new StringBuilder();

		int i = s1.length()-1;
		int j = s2.length()-1;
		int sum = 0;
		int carry = 0;

		while(i >= 0 || j >= 0){
			sum=carry;
			if( i >= 0 ) sum += Character.getNumericValue( s1.charAt(i--) );
			if( j >= 0 ) sum += Character.getNumericValue( s2.charAt(j--) );
			
			ans.append(sum % 2);
			carry = sum/2;
		}
			if(carry != 0)
				ans.append(carry); 
			return ans.reverse().toString();

	}
}