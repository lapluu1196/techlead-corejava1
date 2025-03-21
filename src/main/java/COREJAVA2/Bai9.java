package COREJAVA2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai9 {
    //Đếm số lần xuất hiện của các từ trong một văn bản Hãy viết một chương trình Java để đọc một đoạn văn bản từ
    // người dùng và đếm số lần xuất hiện của mỗi từ trong văn bản. Sử dụng HashMap để lưu trữ từ làm key và số lần
    // xuất hiện làm value. Sau đó, hiển thị danh sách các từ và số lần xuất hiện tương ứng của chúng.
    public static Map<String, Integer> countWord(String string) {
        Map<String, Integer> result = new HashMap<>();

        String str = string.trim().replaceAll("\\s+", " ");
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            result.put(words[i], result.getOrDefault(words[i], 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a paragraph: ");
        try (Scanner scanner = new Scanner(System.in)){
            String paragraph = scanner.nextLine();

            Map<String, Integer> result = countWord(paragraph);

            result.forEach((k, v) -> System.out.println(k + ": " + v));
        }
    }
}
