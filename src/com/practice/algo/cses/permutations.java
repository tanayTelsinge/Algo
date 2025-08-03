//package algo.cses;

import java.util.Scanner;
//if even - add odd first, even from last
//if odd - add even first, odd from last
public class permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }
        if(n <= 3) {
            System.out.println("NO SOLUTION");
            return;
        }
        boolean isEven = n % 2 == 0;
       
        for (int i = 2; i <= n; i += 2) {
            sb.append(i).append(" ");
        }
        // Append odd numbers
        for (int i = 1; i <= n; i += 2) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
