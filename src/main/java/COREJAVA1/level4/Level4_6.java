package COREJAVA1.level4;

import util.InputUtil;

import java.util.Scanner;

public class Level4_6 {
    public static void main(String[] args) {
        //Write a program that takes a list of integers as input and returns the maximum product of any three distinct
        // elements in the list.

        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int max = nums[0] * nums[1] * nums[2];
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        int product = nums[i] * nums[j] * nums[k];
                        if (product > max) {
                            max = product;
                        }
                    }
                }
            }
            System.out.println("The maximum product of any three distinct elements in the list: " + max);
        }
    }
}
