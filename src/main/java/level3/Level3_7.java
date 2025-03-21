package level3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Level3_7 {
    public static void main(String[] args) {
        //Write a program that takes a string as input and returns the length of the longest palindrome that can be formed
        //by rearranging the characters in the string.
        //Giải thích : palindrome	: Chuỗi ký tự mà đọc xuôi hay ngược đều giống nhau, vd: aba, uwu
        //VD: “A man a plan a canal Panama” 👉 21 (amanaplanacanalpanama)

        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a string: ");
            String string = sc.nextLine();

            String newString = string.replace(" ", "").toLowerCase();

            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : newString.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            int res = 0;
            boolean hasOdd = false;

            for (int count : freqMap.values()) {
                if (count % 2 == 0) {
                    res += count;
                } else {
                    res += count - 1;
                    hasOdd = true;
                }
            }

            if (hasOdd) {
                res++;
            }

            System.out.println("The longest palindrome: " + res);
        }
    }
}
