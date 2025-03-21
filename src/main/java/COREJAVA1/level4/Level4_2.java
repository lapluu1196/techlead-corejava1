package COREJAVA1.level4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import util.InputUtil;

public class Level4_2 {
    public static void main(String[] args) {
        //Write a program that takes a list of integers as input and returns the number of distinct subsequences
        // of the list that sum up to a target value.

        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int target = 0;
            while (true) {
                try {
                    System.out.println("Enter the targer value: ");
                    target = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }
            }

            int res = countSubsequencesHelper(nums, target, 0, 0);

            System.out.println("The number of distinct subsequences of the list that sum up to a target value: " + res);
        }
    }

    private static int countSubsequencesHelper(int[] nums, int target, int sum, int index) {
        if (sum == target) {
            return 1;
        }

        if (sum > target || index >= nums.length) {
            return 0;
        }

        int include = countSubsequencesHelper(nums, target, sum + nums[index], index + 1);

        int exclude = countSubsequencesHelper(nums, target, sum, index + 1);

        return include + exclude;
    }
}
