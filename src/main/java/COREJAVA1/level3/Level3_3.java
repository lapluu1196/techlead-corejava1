package COREJAVA1.level3;

import util.InputUtil;

import java.util.Scanner;

public class Level3_3 {
    public static void main(String[] args) {
        //Write a program that takes a list of integers as input and returns the longest increasing subsequence of the numbers.
        // Example: [50, 3, 10, 7, 40, 80 ] 👉 4 ( the longest increasing subsequence is {3, 7, 40, 80} )
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int[] dp = new int[nums.length];
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                dp[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                res = Math.max(res, dp[i]);
            }
            System.out.println("The longest increasing subsequence of the numbers: " + res);
        }
    }
}
