package algo.dp;

public class Knapsack02 {

    public static int getMaxProfit(int[] weights, int[] values, int capacity) {

        int itemCount = weights.length;
        int[][] dp = new int[itemCount + 1][capacity + 1];

        for (int currItem = 0; currItem <= itemCount; currItem++) {
            for (int currCapacity = 0; currCapacity <= capacity; currCapacity++) {
                int prevItem = currItem - 1;
                if (currItem == 0 || currCapacity == 0) {
                    dp[currItem][currCapacity] = 0;
                } else if (weights[prevItem] <= currCapacity) {
                    int include = values[prevItem] + dp[prevItem][currCapacity - weights[prevItem]];
                    int exclude = dp[prevItem][currCapacity];
                    dp[currItem][currCapacity] = Math.max(include, exclude);
                } else {
                    dp[currItem][currCapacity] = dp[prevItem][currCapacity];
                }
            }
        }

        return dp[itemCount][capacity];
    }

    public static void main(String[] args) {
        int[] weights = { 5, 3, 2 }; 

        int[] values = { 10, 8, 6 };

        int capacity = 5;

        int maxProfit = getMaxProfit(weights, values, capacity);

        System.out.println(maxProfit);
    }
}
        