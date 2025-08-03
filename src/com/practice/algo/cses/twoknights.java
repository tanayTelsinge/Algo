package algo.cses;

import java.util.Scanner;
public class twoknights {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(long k = 1; k <= n; k++) {
            long totalSquares = (long) k * k;

            //total ways to place 2 knights C(n,2)
            long totalWays = totalSquares * (totalSquares - 1) / 2;
            
            long attackingWays = 0;
            if (k > 2) {
                attackingWays = 4L * (k - 1) * (k - 2);
            }

            long nonAttackingWays = totalWays - attackingWays;

            System.out.println(nonAttackingWays);

        }

    }
}
