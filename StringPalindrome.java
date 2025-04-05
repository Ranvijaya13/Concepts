
import java.util.Scanner;

public class StringPalindrome {

    // Function to find the longest palindromic subsequence
    public static String makePalindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Fill the DP table
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1; // Single character palindromes
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // Reconstruct the palindrome from the DP table
        int i = 0, j = n - 1;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                left.append(str.charAt(i));
                if (i != j) {
                    right.insert(0, str.charAt(j));
                }
                i++;
                j--;
            } else if (dp[i + 1][j] >= dp[i][j - 1]) {
                i++;
            } else {
                j--;
            }
        }

        return left.toString() + right.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Generating the palindrome
        String result = makePalindrome(input);

        // Printing the output
        System.out.println("Return String = \"" + result + "\"");

        scanner.close();
    }
}
