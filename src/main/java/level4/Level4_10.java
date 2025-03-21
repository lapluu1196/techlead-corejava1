package level4;

import util.InputUtil;

import java.util.Scanner;

public class Level4_10 {
    public static void main(String[] args) {
        // Write a program that takes a list of strings as input and returns the two strings with the largest overlap
        // of substrings, where the substrings must be at lea	st k characters long (where k is a parameter to the function).
        try (Scanner sc = new Scanner(System.in)) {
            String[] strings = InputUtil.inputListOfString(sc);

            int k = 0;
            while (true) {
                try {
                    System.out.println("Enter k (minimum substring length): ");
                    k = Integer.parseInt(sc.nextLine());
                    if (k <= 0) {
                        System.out.println("k must be positive.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number k.");
                }
            }

            String[] res = findLargestOverlap(strings, k);

            if (res[0] != null && res[1] != null) {
                System.out.println("The two strings with the largest overlap of substrings: " + res[0] + ", " + res[1]);
            } else {
                System.out.println("No overlapping strings found with the given k.");
            }
        }
    }

    private static String[] findLargestOverlap(String[] strings, int k) {
        String[] res = new String[2];
        int maxOverlap = 0;

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                int overlap = calculateOverlap(strings[i], strings[j], k);
                if (overlap > maxOverlap) {
                    maxOverlap = overlap;
                    res[0] = strings[i];
                    res[1] = strings[j];
                }
            }
        }
        return res;
    }

    private static int calculateOverlap(String s1, String s2, int k) {
        int maxOverlap = 0;
        int len1 = s1.length();
        int len2 = s2.length();

        for (int length = k; length <= Math.min(len1, len2); length++) {
            for (int start1 = 0; start1 <= len1 - length; start1++) {
                String sub1 = s1.substring(start1, start1 + length);
                for (int start2 = 0; start2 <= len2 - length; start2++) {
                    String sub2 = s2.substring(start2, start2 + length);
                    if (sub1.equals(sub2)) {
                        maxOverlap = Math.max(maxOverlap, length);
                    }
                }
            }
        }
        return maxOverlap;
    }
}
