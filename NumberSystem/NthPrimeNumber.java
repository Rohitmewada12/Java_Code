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
