package COREJAVA2;

import COREJAVA2.bai8.entity.Product;
import COREJAVA2.bai8.service.ProductService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai11 {
    //Tạo từ điển đơn giản Hãy tạo một từ điển đơn giản sử dụng HashMap. Cho phép người dùng thêm từ và định nghĩa của
    // từ vào từ điển. Sau đó, cho phép người dùng tra cứu từ điển bằng cách nhập từ cần tìm kiếm và hiển thị định nghĩa của từ đó.
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("-------------------------------------");
            System.out.println("===== DICTIONARY =====");
            System.out.println("1. Search");
            System.out.println("2. Add a word");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Please choose function you'd like to do: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ignored) {}

            switch (choice) {
                case 1:
                    System.out.println("Enter word: ");
                    String word = sc.nextLine();
                    if (dictionary.containsKey(word.toLowerCase())) {
                        System.out.println("Definition: " + dictionary.get(word));
                    } else {
                        System.out.println("Word not found.");
                    }
                    break;
                case 2:
                    System.out.println("Enter new word: ");
                    String newWord = sc.nextLine();
                    System.out.println("Enter definition: ");
                    String definition = sc.nextLine();
                    dictionary.put(newWord.toLowerCase(), definition);
                    System.out.println("Word added successfully.");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid number.");
                    break;
            }
        } while (true);
    }
}
