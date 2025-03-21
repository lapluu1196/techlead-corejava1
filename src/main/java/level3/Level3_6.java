package level3;

import util.InputUtil;

import java.util.Scanner;

public class Level3_6 {
    public static void main(String[] args) {
        //Write a program that takes two lists of integers as input and returns the median of the combined list.
        try (Scanner sc = new Scanner(System.in)){
            int[] nums1 = InputUtil.inputListOfNumber(sc);
            int[] nums2 = InputUtil.inputListOfNumber(sc);

            int total = nums1.length + nums2.length;
            int[] cList = new int[total];
            for (int i = 0; i < nums1.length; i++) {
                cList[i] = nums1[i];
            }
            for (int i = nums1.length; i < total; i++) {
                cList[i] = nums2[i-nums1.length];
            }

            if (total % 2 == 0) {
                System.out.println("Median: " + (cList[total / 2] + cList[total / 2 - 1]) / 2.0);
            } else {
                System.out.println("Median: " + cList[total / 2]);
            }
        }
    }
}
