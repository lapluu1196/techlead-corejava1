package level1;

import java.util.Arrays;
import java.util.Scanner;

import static util.InputUtil.inputListOfString;

public class Level1_7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String[] strings = inputListOfString(sc);

            System.out.println("Sorted strings: ");
            Arrays.stream(strings).sorted().forEach(System.out::println);
        }
    }
}
