package COREJAVA1.level4;

import util.InputUtil;

import java.util.Scanner;

public class Level4_9 {
    public static void main(String[] args) {
        //Write a program that takes a list of integers as input and returns the length of the longest increasing
        //subsequence of the numbers, with the additional constraint that no two adjacent elements in the subsequence
        //can differ by more than 1. ( Khuyến khích dùng reduce )

        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int[] dp = new int[nums.length];
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                dp[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j] && Math.abs(nums[i] - nums[j]) <= 1) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                res = Math.max(res, dp[i]);
            }
            System.out.println("The length of the longest increasing subsequence of the numbers: " + res);
        }
    }
}
