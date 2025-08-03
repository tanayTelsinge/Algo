package algo.dp;
//explain
// Coin Change Problem: Given a set of coins and an amount, find the number of ways to make change for that amount using the coins.
// This is a classic dynamic programming problem that can be solved using a bottom-up approach.
//tree
// The idea is to use a dynamic programming array where dp[i] represents the number of ways to make change for amount i.
// We initialize dp[0] to 1 because there is one way to make change for amount 0 (using no coins).
// We then iterate through each coin and update the dp array for all amounts from the coin value
// to the target amount. For each coin, we add the number of ways to make change for the current amount minus the coin value.
public class CoinChange {
    
    //add coin change problem
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // Base case: one way to make amount 0

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) { //explaning the loop
                // For each coin, update the number of ways to make change for amounts
                // from coin to amount
                // dp[j] represents the number of ways to make change for amount j
                // dp[j - coin] represents the number of ways to make change for amount j - coin
                // By adding dp[j - coin] to dp[j], we are counting all the ways
                dp[j] += dp[j - coin];
            }
        }

        return dp[amount];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int ways = coinChange(coins, amount);
        System.out.println("Number of ways to make change for " + amount + " is: " + ways);
    }
}
