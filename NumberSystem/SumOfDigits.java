/**
 * Program: Sum of Digits
 * Author: Rohit Mewada
 *
 * Problem:
 *   Given an integer n, calculate the sum of its digits.
 *   Example: 
 *     Input: 1234
 *     Output: 10  (1 + 2 + 3 + 4)
 *
 * Approach:
 *   1. Extract the last digit using modulo operator (% 10).
 *   2. Add it to a running sum.
 *   3. Remove the last digit by dividing the number by 10.
 *   4. Repeat steps 1–3 until the number becomes 0.
 *   5. Return the sum.
 *
 * Time Complexity: O(d), where d = number of digits in n
 * Space Complexity: O(1) — constant space
 */
package NumberSystem;

import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigits = n % 10;
            sum = sum + lastDigits;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
        sc.close();
    }
}
