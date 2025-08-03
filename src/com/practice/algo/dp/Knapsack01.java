package algo.dp;

public class Knapsack01 {
    // Function to solve 0/1 Knapsack Problem
    public static int getMaxProfit(int[] weights, int[] values, int capacity) {
        int itemCount = weights.length;

        // Create DP table: rows = items, columns = capacities
        int[][] dp = new int[itemCount + 1][capacity + 1];

        // Build the DP table in bottom-up manner
        for (int i = 0; i <= itemCount; i++) {
            for (int currCapacity = 0; currCapacity <= capacity; currCapacity++) {

                // Base case: no    items or zero capacity
                if (i == 0 || currCapacity == 0) {
                    dp[i][currCapacity] = 0;
                }
                // If current item's weight is less than or equal to the current capacity
                else if (weights[i - 1] <= currCapacity) {
                    // Include the item or exclude it — take the max
                    int include = values[i - 1] + dp[i - 1][currCapacity - weights[i - 1]];
                    int exclude = dp[i - 1][currCapacity]; //some times, less weight, but higher profit values so better to exclude.
                    dp[i][currCapacity] = Math.max(include, exclude);
                }
                // Otherwise, exclude the item
                else {
                    dp[i][currCapacity] = dp[i - 1][currCapacity];
                }
            }
        }

        // The bottom-right cell contains the final answer
        return dp[itemCount][capacity];
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] weights = {5, 3, 2};
        int[] values  = {10, 8, 6};
        int capacity = 5;

        int maxProfit = getMaxProfit(weights, values, capacity);
        System.out.println("Maximum Profit = " + maxProfit);
    }
}

