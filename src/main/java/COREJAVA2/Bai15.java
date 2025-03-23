package COREJAVA2;

import util.InputUtil;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai15 {
    //Hãy tạo một chương trình Java để nhập hai tập hợp (HashSet) các số nguyên từ người dùng. Hãy tìm và hiển thị
    // tất cả các phần tử thuộc cả hai tập hợp (hợp) của hai tập hợp này.
    public static void main(String[] args) {
        Set<Integer> nums1 = new HashSet<>();
        Set<Integer> nums2 = new HashSet<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter list of numbers 1");
            int[] arr1 = InputUtil.inputListOfNumber(sc);
            for (int num : arr1) {
                nums1.add(num);
            }

            System.out.println("Enter list of numbers 2");
            int[] arr2 = InputUtil.inputListOfNumber(sc);
            for (int num : arr2) {
                nums2.add(num);
            }

            Set<Integer> union = new HashSet<>(nums1);
            union.addAll(nums2);

            System.out.println("Union: " + union);
        }
    }
}
