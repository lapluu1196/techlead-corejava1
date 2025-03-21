package COREJAVA1.level4;

import util.InputUtil;

import java.util.Scanner;

public class Level4_1 {
    public static void main(String[] args) {
        //Write a program that takes a list of integers as input and returns the minimum number of moves required to
        // sort the list in ascending order using bubble sort.

        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int moves = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums.length - i - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        moves++;
                    }
                }
            }
            System.out.println("Moves: " + moves);
        }
    }
}
