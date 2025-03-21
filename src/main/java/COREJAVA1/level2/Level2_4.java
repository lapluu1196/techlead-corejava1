package COREJAVA1.level2;

import util.InputUtil;

import java.util.Scanner;

public class Level2_4 {
    public static void main(String[] args) {
        // Write a program that takes a list of numbers as input and returns the sum of the numbers that are divisible by both 3 and 5.
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 3 == 0 && nums[i] % 5 == 0) {
                    sum += nums[i];
                }
            }
            System.out.println("Sum: " + sum);
        }
    }
}
