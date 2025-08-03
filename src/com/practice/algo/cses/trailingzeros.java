package algo.cses;
import java.util.Scanner;
//Trick - Trailing zero count -> divide by 5 multiples
//n/5  + n/25 + n/125 => sum remainders, note that multiples of 5 less than n.

public class trailingzeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        
        long remainder = 1;
        int divisor = 5;
        int count = 0;
        while(remainder > 0 && divisor <= n) {
            remainder = n / divisor;
            divisor *= 5;
            count += remainder;
        }

        System.out.println(count);

    }
    
}
