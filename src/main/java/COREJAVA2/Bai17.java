package COREJAVA2;

import util.InputUtil;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai17 {
    //Hãy viết một chương trình Java để nhập một tập hợp (HashSet) các chuỗi từ người dùng và xóa tất cả các
    // phần tử trùng lặp, chỉ giữ lại một phần tử duy nhất cho mỗi giá trị.
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter list of strings (Enter empty line to stop)");
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                if (str.isEmpty()) {
                    break;
                }
                strings.add(str);
            }

            System.out.println("Unique strings: " + strings);
        }
    }
}
