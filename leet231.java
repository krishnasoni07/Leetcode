// Program to check a number is power of 2 or not

import java.lang.Math;
import java.util.Scanner;

public class leet231{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if(num == 1 || num == 2 || num == 4  || num == 8||
	   num == 16 || num == 32 || num == 64 || num == 128 ||
	num == 256 || num == 512 || num == 1024|| num == 2048  || num == 4096 || num == 8192 || num == 16384 || num == 32768 || num == 65536 || num == 131072 || num == 262144 ||
num == 524288 || num == 1048576 || num == 2097152 || num == 4194304 || num == 8388608 || num == 16777216 || num == 33554432 || num == 67108864 || num == 134217728 || num == 268435456 || num == 536870912 || num == 1073741824 || num == 2147483647
)
			System.out.println("True");
		else
			System.out.println("False");
	}
}

/*

2
4
8
16
32
64
128
256
512
1024
2048
4096
8192
16384
32768
65536
131072
262144
524288
1048576
2097152
4194304
8388608
16777216
33554432
67108864
134217728
268435456
536870912
1073741824
2147483647





|| num == 8||
	   num == 16 || num == 32 || num == 64 || num == 128
	num == 256 || num == 512 || num == 1024|| num == 2048
|| num == 4096 || num == 8192 || num == 16384 || num == 32768 || num == 65536 || num == 131072 || num == 262144 ||
num == 524288 || num == 1048576 || num == 2097152 || num == 4194304 || num == 8388608 || num == 16777216 || num == 33554432 || num == 67108864 || num == 134217728 || num == 268435456 || num == 536870912 || num == 1073741824 || num == 2147483647


*/