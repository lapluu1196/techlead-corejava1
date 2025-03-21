package COREJAVA1.level1;

import java.util.Scanner;

import static util.InputUtil.inputListOfString;

public class Level1_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String[] strings = inputListOfString(sc);

            int count = 0;
            for (String str : strings) {
                if (str.contains("a")) {
                    count++;
                }
            }

            System.out.println("Number of strings containing 'a': " + count);
        }
    }
}
