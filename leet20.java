// Program to get a set of paranthesis is valid or not

import java.util.Scanner;

public class leet20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println(validParanthesis( sc.next() ) );
	}

	static boolean validParanthesis( String s ){
		if(s.length() % 2 == 0 && s.charAt(0) != ')' && s.charAt(0) != ']' && s.charAt(0) != '}'){
            StringBuilder str = new StringBuilder();

            for(int i = 0 ; i < s.length() ; i++ ){
                char ch = s.charAt(i);
                if(str.length() > ( s.length() / 2 ) || (str.isEmpty() == true && (ch == ')' || ch == ']' || ch == '}')) ) return false;

                if(ch == '(') str.append(')');
                else if (ch == '[') str.append(']');
                else if(ch == '{') str.append('}');
                else{
                    if (ch == str.charAt(str.length() - 1))
                        str.deleteCharAt(str.length() - 1);
                    else return false;
                }
            }
            return (str.length() == 0) ? true : false;
        }
        return false;
    }
}