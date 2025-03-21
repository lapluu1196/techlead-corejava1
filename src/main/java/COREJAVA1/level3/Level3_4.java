package COREJAVA1.level3;

import util.InputUtil;

import java.util.Scanner;

public class Level3_4 {
    public static void main(String[] args) {
        //Write a program that takes a list of strings as input and returns the two strings with the largest overlap of characters.
        //Example: ["hello", "world", "foobar", "barfoo", "he", "llo", “foobars”, “abc”, “cba"] => [“barfoo”, “foobar”] 6/6 overlap.
        try (Scanner sc = new Scanner(System.in)) {
            String[] strings = InputUtil.inputListOfString(sc);

            int maxOverlap = 0;
            String str1 = null;
            String str2 = null;
            for (int i = 0; i < strings.length; i++) {
                for (int j = i + 1; j < strings.length; j++) {
                    int overlap = 0;
                    for (int k = 0; k < Math.min(strings[i].length(), strings[j].length()); k++) {
                        if (strings[i].charAt(k) == strings[j].charAt(k)) {
                            overlap++;
                        }
                    }
                    if (overlap > maxOverlap) {
                        maxOverlap = overlap;
                        str1 = strings[i];
                        str2 = strings[j];
                    }
                }
            }

            System.out.println("The two strings with the largest overlap of characters: " + str1 + ", " + str2);
        }
    }
}
