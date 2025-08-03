//package algo.cses;

import java.util.Scanner;

public class bitstrings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long res = 1;
        long mod = 1_000_000_007;
        for(long i = 0L; i < n; i++) {
            res = (2 * res) % mod;
        }

        System.out.println(res);
        
    }
}
