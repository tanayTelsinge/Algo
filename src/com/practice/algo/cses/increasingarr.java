//package algo.cses;

import java.util.Scanner;

public class increasingarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = n;
        int[] arr = new int[n];
        int idx = 0;
        while(idx < total) {
            arr[idx++] = sc.nextInt();
        }
        long moves = 0;
        for(int i = 1; i < n; i++) {
            long diff = arr[i - 1] - arr[i];
            if(diff > 0) {
                moves += diff;
                arr[i] = arr[i - 1];
            }
        }

        System.out.println(moves);
    }
}
