package COREJAVA2;

import util.InputUtil;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai16 {
    //Hãy viết một chương trình Java để nhập một tập hợp (HashSet) các số nguyên từ người dùng và tìm phần tử lớn nhất
    // và nhỏ nhất trong tập hợp.
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter list of numbers");
            int[] arr1 = InputUtil.inputListOfNumber(sc);
            for (int num : arr1) {
                nums.add(num);
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int num : nums) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
    }
}
