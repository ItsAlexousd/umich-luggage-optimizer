import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a File object for the input.txt file
        File file = new File("input.txt");

        try (Scanner sc = new Scanner(file)) {
            // Read the number of test cases
            int C = sc.nextInt();

            // Process each test case
            for (int i = 0; i < C; i++) {
                // Read the number of items and maximum volume
                int N = sc.nextInt();
                int W = sc.nextInt();

                // Arrays to store item names, volumes, and values
                String[] names = new String[N];
                int[] volumes = new int[N];
                int[] values = new int[N];

                // Read item details for each item
                for (int j = 0; j < N; j++) {
                    names[j] = sc.next();
                    volumes[j] = sc.nextInt();
                    values[j] = sc.nextInt();
                }

                // 2D array to store the maximum value for each subproblem
                int[][] dp = new int[N + 1][W + 1];

                // Compute the maximum value for each subproblem
                for (int j = 1; j <= N; j++) {
                    for (int k = 1; k <= W; k++) {
                        if (volumes[j - 1] <= k) {
                            // Include the j-th item in the knapsack
                            dp[j][k] = Math.max(dp[j - 1][k], dp[j - 1][k - volumes[j - 1]] + values[j - 1]);
                        } else {
                            // Exclude the j-th item from the knapsack
                            dp[j][k] = dp[j - 1][k];
                        }
                    }
                }

                // Get the maximum value achieved
                int maxValue = dp[N][W];
                // Count the number of items selected
                int itemCount = 0;
                // Current remaining volume
                int currentVolume = W;

                // Determine the selected items
                for (int j = N; j > 0 && maxValue > 0; j--) {
                    if (maxValue != dp[j - 1][currentVolume]) {
                        // The j-th item was selected
                        itemCount++;
                        // Reduce the maximum value and remaining volume
                        maxValue -= values[j - 1];
                        currentVolume -= volumes[j - 1];
                    }
                }

                // Print the maximum value and item count for the current test case
                System.out.println(dp[N][W] + " " + itemCount);

                // Print the names of the selected items
                for (int j = N; j > 0 && dp[N][W] > 0; j--) {
                    if (dp[N][W] != dp[j - 1][W]) {
                        System.out.println(names[j - 1]);
                        // Reduce the maximum value and remaining volume
                        dp[N][W] -= values[j - 1];
                        W -= volumes[j - 1];
                    }
                }
            }
        } catch (Exception e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
}
