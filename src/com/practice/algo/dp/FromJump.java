package algo.dp;

import java.util.Arrays;

public class FromJump {

    public static void main(String[] args) {
        //input for frog jump
        int[] height = {10, 20, 30, 10};
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int minCostToJump = frogJump(height, n - 1, dp);
        System.out.println(minCostToJump);
    }

    public static int frogJump(int[] height, int n, int[] dp) {
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int diffOneStep =  Math.abs(height[n] - height[n - 1]);
        int oneStep = frogJump(height, n - 1, dp) + diffOneStep;
        int twoStep = Integer.MAX_VALUE;

        if(n > 1) {
            int diffTwoStep = Math.abs(height[n] - height[n - 2]);
            twoStep = frogJump(height, n - 2, dp) + diffTwoStep;
        }

        dp[n] = Math.min(oneStep, twoStep);
        return dp[n];

    }
    
}
