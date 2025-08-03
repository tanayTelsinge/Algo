package algo.cses;

import java.util.Scanner;

public class weirdalgo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        System.out.print(n);
        while(n > 1) {
            boolean isEven = n % 2 == 0;
            n = isEven ? n / 2 : (n * 3) + 1;
            System.out.print(" " + n);
        }
    }
}
