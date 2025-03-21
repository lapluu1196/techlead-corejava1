package level4;

import util.InputUtil;

import java.util.Scanner;

public class Level4_3 {
    public static void main(String[] args) {
        //Write a program that takes a list of strings as input and returns the length of the longest substring
        // that appears in every string in the list.

        try (Scanner sc = new Scanner(System.in)) {
            String[] strings = InputUtil.inputListOfString(sc);

            int maxLength = 0;
            String minLengthString = strings[0];
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() < minLengthString.length()) {
                    minLengthString = strings[i];
                }
            }

            for (int i = 0; i < minLengthString.length(); i++) {
                int count = 0;
                for (int j = 0; j < strings.length; j++) {
                    if (strings[j].contains(minLengthString.substring(i))) {
                        count++;
                    }
                }
                if (count == strings.length) {
                    maxLength++;
                }
            }

            System.out.println("The length of the longest substring that appears in every string in the list: " + maxLength);
        }
    }
}
