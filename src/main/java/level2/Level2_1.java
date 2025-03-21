package level2;

import util.InputUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Level2_1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] nums = InputUtil.inputListOfNumber(sc);

            int[] sorted = Arrays.stream(nums).sorted().toArray();

            System.out.println("The second largest number: " + sorted[sorted.length - 2]);

        }
    }
}
