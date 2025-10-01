package NumberSystem;


/*
 * Problem: Reduce a number to a single digit by repeatedly summing its digits.
 *
 * Approaches Implemented:
 *
 * 1. Mathematical Approach (Using Modulo 9 / Digital Root Formula):
 *    - A number can be reduced to a single digit using the property of modulo 9.
 *    - digital_root(n) = 0 if n == 0, else (n % 9 == 0 ? 9 : n % 9).
 *    - Time Complexity: O(1)
 *    - Space Complexity: O(1)
 *
 * 2. Brute Force Approach (Iterative Digit Summation):
 *    - Repeatedly calculate the sum of digits until the number is a single digit.
 *    - Example: 555 → 5+5+5 = 15 → 1+5 = 6
 *    - Time Complexity: O(log n * iterations) [since we repeatedly split digits]
 *    - Space Complexity: O(1)
 *
 * Example:
 * Input: 555
 * Output using Formula: 6
 * Output using Iteration: 6
 */

public class SumToSingleDigits {
    // Approach Using Ternary Operator
    public static int singleDigitSum(int n) {
        if(n==0)
        return 0;
        return (n%9==9)?9:n%9;
    }

    // Brute force Apporach

    public static int sumToSingle(int n){
        while(n>9) {
            int sum=0;
            while (n!=0) {
                int rem = n%10;
                sum+=rem;
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
        int n =555;
        System.out.println(singleDigitSum(n));
        System.out.println(sumToSingle(n));
    }
}
