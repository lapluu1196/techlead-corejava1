package COREJAVA1.level3;

import util.InputUtil;

import java.util.Scanner;

public class Level3_2 {
    public static void main(String[] args) {
        //Write a program that takes a list of integers as input and returns the maximum difference between any two elements in the list.
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int max = nums[0] - nums[1];
            for (int i = 1; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int diff = Math.abs(nums[i] - nums[j]);
                    if (diff > max) {
                        max = diff;
                    }
                }
            }
            System.out.println("The maximum difference between any two elements in the list: " + max);
        }
    }
}
