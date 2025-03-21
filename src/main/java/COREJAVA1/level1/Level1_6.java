package COREJAVA1.level1;

import java.util.Arrays;
import java.util.Scanner;

import static util.InputUtil.inputListOfNumber;

public class Level1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = inputListOfNumber(sc);

        Arrays.stream(nums).sorted().forEach(System.out::println);

        sc.close();
    }
}
