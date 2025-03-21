package COREJAVA1.level5;

import util.InputUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Level5_3 {
    public static void main(String[] args) {
        //uniq: Cho một mảng đầu vào, viết một function để loại bỏ các phần tử bị lặp trong mảng.
        //Ví dụ [1, 2, 3, 2, 4] 👉 [1, 2, 3, 4]
        try (Scanner sc = new Scanner(System.in)) {
            String[] arr = InputUtil.inputListOfString(sc);

            String[] result = getUniqElement(arr);

            System.out.println("Unique elements: " + Arrays.toString(result));
        }
    }

    private static String[] getUniqElement(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != null && arr[i].equals(arr[j])) {
                    count++;
                    arr[j] = null;
                }
            }
        }

        String[] result = new String[arr.length - count];
        int index = 0;
        for (String s : arr) {
            if (s != null) {
                result[index++] = s;
            }
        }
        return result;
    }
}
