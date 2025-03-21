package level5;

import util.InputUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Level5_2 {
    public static void main(String[] args) {
        //chunk: Cho một mảng đầu vào, viết một function để chia đều mảng theo số phần chỉ định.
        //Ví dụ: ['a', 'b', 'c', 'd']
        //chunk(['a', 'b', 'c', 'd'], 2); 👉 [['a', 'b'], ['c', 'd']]
        //chunk(['a', 'b', 'c', 'd'], 3); 👉 [['a', 'b', 'c'], ['d']]
        try (Scanner sc = new Scanner(System.in)) {
            String[] arr = InputUtil.inputListOfString(sc);

            int size = 0;
            while (true) {
                try {
                    System.out.println("Enter size: ");
                    size = Integer.parseInt(sc.nextLine());
                    if (size <= 0) {
                        System.out.println("Size must be positive.");
                        continue;
                    }
                    String[][] result = chunk(arr, size);
                    System.out.println("Result: ");
                    for (String[] chunk : result) {
                        System.out.println(Arrays.toString(chunk));
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }
            }
        }
    }

    private static String[][] chunk(String[] arr, int size) {
        int numChunks = (arr.length + size - 1) / size;
        String[][] result = new String[numChunks][];

        for (int i = 0; i < numChunks; i++) {
            int start = i * size;
            int end = Math.min(start + size, arr.length);

            String[] chunk = Arrays.copyOfRange(arr, start, end);
            result[i] = chunk;
        }

        return result;
    }
}
