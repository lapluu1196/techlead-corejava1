package COREJAVA2;

import util.InputUtil;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai13 {
    //Hãy viết một chương trình Java để nhập một mảng các số nguyên từ người dùng và tạo một HashSet để lưu trữ
    // các phần tử của mảng. Sau đó, hãy hiển thị các phần tử trùng lặp trong mảng.
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = InputUtil.inputListOfNumber(sc);

            for (int num : arr) {
                if (nums.contains(num)) {
                    duplicates.add(num);
                } else {
                    nums.add(num);
                }
            }

            System.out.println("Duplicates: " + duplicates);
        }
    }
}
