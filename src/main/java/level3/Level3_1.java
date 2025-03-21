package level3;

import util.InputUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Level3_1 {
    public static void main(String[] args) {
        // Write a program that takes a list of numbers as input and returns the second smallest number in the list.
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int[] sorted = Arrays.stream(nums).sorted().toArray();

            System.out.println("The second largest number: " + sorted[1]);

        }
    }
}
