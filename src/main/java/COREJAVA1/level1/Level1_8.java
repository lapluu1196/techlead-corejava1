package COREJAVA1.level1;

import util.InputUtil;

import java.util.Scanner;


public class Level1_8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int[] nums = InputUtil.inputListOfNumber(sc);

            if (nums.length % 2 == 0) {
                System.out.println("Median: " + (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0);
            } else {
                System.out.println("Median: " + nums[nums.length / 2]);
            }
        }
    }
}
