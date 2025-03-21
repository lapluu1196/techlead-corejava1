package COREJAVA1.level4;

import util.InputUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Level4_7 {
    public static void main(String[] args) {
        //Write a program that takes a list of strings as input and returns the list sorted by the number of distinct
        // words in each string, with the longest strings appearing first.
        //(Khuyến khích dùng forEach với javascript )

        try (Scanner sc = new Scanner(System.in)) {
            String[] strings = InputUtil.inputListOfString(sc);

            Arrays.sort(strings, (a, b) -> {
                int distinctA = (int) a.length();
                int distinctB = (int) b.length();
                if (distinctA == distinctB) {
                    return a.compareTo(b);
                }
                return Integer.compare(distinctB, distinctA);
            });

            System.out.println("Sorted list:");
            System.out.println(Arrays.toString(strings));

        }
    }
}
