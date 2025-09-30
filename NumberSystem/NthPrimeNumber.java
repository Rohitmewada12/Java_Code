/**
 * Program: Nth Prime Number
 * Author: Rohit Mewada
 * 
 * Description:
 *   This program finds the Nth prime number.
 *
 * Approach:
 *   1. Start from number = 2.
 *   2. Check if the number is prime using a helper function.
 *   3. Keep a counter of how many primes found so far.
 *   4. Stop when the counter reaches N and print the number.
 *
 * Example:
 *   Input: N = 5
 *   Output: 11
 */
package NumberSystem;

import java.util.Scanner;

public class NthPrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;
        int count = 0;
        int n = sc.nextInt();
        while (count < n) {
            if (isPrime(i)) {
                count++;
                if (count == n) {
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}
