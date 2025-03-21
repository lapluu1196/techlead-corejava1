package level1;

import java.util.Scanner;

import static util.InputUtil.inputListOfString;

public class Level1_5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String[] strings = inputListOfString(sc);

            int min = strings[0].length();
            for (int i = 1; i < strings.length; i++) {
                if (strings[i].length() < min) {
                    min = strings[i].length();
                }
            }

            System.out.println("Shortest string: ");
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() == min) {
                    System.out.println(strings[i]);
                }
            }

        }
    }
}
