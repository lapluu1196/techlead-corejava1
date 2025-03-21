package COREJAVA1.level2;

import util.InputUtil;

import java.util.Scanner;

public class Level2_2 {
    public static void main(String[] args) {
        //Write a program that takes a list of strings as input and returns the longest word in the list.

        try (Scanner sc = new Scanner(System.in)) {
            String[] strings = InputUtil.inputListOfString(sc);

            String longestWord = strings[0];
            for (int i = 0; i < strings.length; i++) {
                if (longestWord.length() < strings[i].length()) {
                    longestWord = strings[i];
                }
            }

            System.out.println("The longest word: " + longestWord);
        }
    }
}
