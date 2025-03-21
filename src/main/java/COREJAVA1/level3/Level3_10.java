package COREJAVA1.level3;

import util.InputUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Level3_10 {
    public static void main(String[] args) {
        //Write a program that takes a list of strings as input and returns the list sorted by the number of
        //distinct characters in each string, with the shortest strings appearing first.
        //VD: ['apple', 'banana', 'orange', 'kiwi', 'strawberry'] 👉 ['kiwi', 'apple', 'orange', 'banana', 'strawberry']

        try (Scanner sc = new Scanner(System.in)) {
            String[] strings = InputUtil.inputListOfString(sc);

            Arrays.sort(strings, (a, b) -> {
                int distinctA = (int) a.chars().distinct().count();
                int distinctB = (int) b.chars().distinct().count();
                if (distinctA == distinctB) {
                    return a.compareTo(b);
                }
                return Integer.compare(distinctA, distinctB);
            });

            System.out.println("Sorted list:");
            System.out.println(Arrays.toString(strings));
        }
    }
}
