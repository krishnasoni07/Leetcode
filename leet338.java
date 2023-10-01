import java.util.Scanner;

public class leet338 {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] result = countBits(n);
        System.out.println("Count of 1s in binary representation for numbers from 0 to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println("Bit count for " + i + " is " + result[i]);
        }
    }
}
