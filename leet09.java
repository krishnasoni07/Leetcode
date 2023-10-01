// Program to check a number is palindrome or not
// Logic : - 
//		I had converted the number into string and start iterating from
// 			both sides of string till the half length of the string,
//			and checked if the characters are equal or not.

import java.util.Scanner;

public class leet09{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = isPalin(num);
		if(flag == true)
			System.out.println("True");	
		else
			System.out.println("False");
	}

	static boolean isPalin(int x){
String str = new String();
        str = String.valueOf(x);

        for(int i = 0 , j = str.length() - 1 ; i <= (str.length() - 1) / 2 ; i++ , j-- ){
            if(str.charAt(i) == str.charAt(j)) continue;
            return false;
        }
        return true;
	}
}