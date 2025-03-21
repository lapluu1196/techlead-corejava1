package level2;

import java.util.Scanner;

public class Level2_3 {
    public static void main(String[] args) {
        // Write a program that takes two strings as input and returns the longest common subsequence of the two strings.
        // VD: đầu vào [“abcdef", “abczyzcdef”], Đầu ra: “cdef"

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first string: ");
            String s1 = sc.nextLine();
            System.out.println("Enter second string: ");
            String s2 = sc.nextLine();

            int m = s1.length();
            int n = s2.length();

            int[][] dp = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }

            StringBuilder lcs = new StringBuilder();
            int i = m, j = n;

            while (i > 0 && j > 0) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcs.append(s1.charAt(i - 1));
                    i--;
                    j--;
                } else if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }

            System.out.println("Longest Common Subsequence: " + lcs.reverse().toString());
        }
    }

}
