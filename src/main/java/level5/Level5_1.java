package level5;

import java.util.Scanner;

public class Level5_1 {
    public static void main(String[] args) {
        //reverses: Cho đầu vào là 1 mảng, Viết một function để đảo ngược thứ tự phần tử trong mảng ,
        // yêu cầu không dùng hàm Reverses có sẵn của javascript ( dùng forEach hoặc reduce )

        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a string: ");
            String string = sc.nextLine();

            String reversedString = reverseString(string);

            System.out.println("Reversed string: " + reversedString);
        }
    }

    private static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
