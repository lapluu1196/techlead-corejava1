package COREJAVA1.level1;

import java.util.Scanner;

import static util.InputUtil.inputListOfNumber;

public class Level1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = inputListOfNumber(sc);
        if (nums == null) return;

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Largest number: " + max);

        sc.close();
    }
}
