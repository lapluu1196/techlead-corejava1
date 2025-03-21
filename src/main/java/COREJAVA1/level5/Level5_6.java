package COREJAVA1.level5;

import java.util.Scanner;

public class Level5_6 {
    public static void main(String[] args) {
        //TrimAll: Viết function loại bỏ tất cả khoảng trắng đầu và cuối của một chuỗi bất kỳ, nếu có khoảng trắng
        // ở giữa chuỗi đó thì chỉ giữ lại một khoảng trắng.

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = sc.nextLine();

            System.out.println("Trimmed string: " + trimAll(str));
        }

    }

    public static String trimAll(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }
}
