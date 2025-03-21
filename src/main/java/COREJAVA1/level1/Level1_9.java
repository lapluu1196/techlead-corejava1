package COREJAVA1.level1;

import java.util.Scanner;

public class Level1_9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a strings: ");
            String input = sc.nextLine();

            String[] strings = input.split(" ");

            System.out.println("Number of words: " + strings.length);
        }
    }
}
