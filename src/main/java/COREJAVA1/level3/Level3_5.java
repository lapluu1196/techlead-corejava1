package COREJAVA1.level3;

import util.InputUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Level3_5 {
    public static void main(String[] args) {
        //Write a program that takes a list of numbers as input and returns the smallest positive integer
        //that cannot be represented as the sum of any subset of the list.
        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int res = 1;
            int[] sorted = Arrays.stream(nums).sorted().toArray();

            for (int i = 0; i < sorted.length; i++) {
                if (sorted[i] > res) {
                    break;
                } else {
                    res += sorted[i];
                }
            }

            System.out.println("The smallest positive integer that cannot be represented as the sum of any subset of the list: " + res);
        }
    }
}
