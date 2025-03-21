package COREJAVA1.level2;

import util.InputUtil;

import java.util.Scanner;

public class Level2_5 {
    public static void main(String[] args) {
        //Write a program that takes a list of integers as input and returns the maximum sum of any contiguous subarray within the list.
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i] += Math.max(nums[i - 1], 0);
                res = Math.max(res, nums[i]);
            }
            System.out.println("The maximum sum of any contiguous subarray within the list: " + res);
        }
    }
}
