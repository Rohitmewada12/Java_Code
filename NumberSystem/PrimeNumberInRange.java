package NumberSystem;
import java.util.Scanner;
public class PrimeNumberInRange {
    static boolean isPrime(int n) {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int i=2;
        while(count<n) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        sc.close();
    }
    }
