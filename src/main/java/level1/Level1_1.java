package level1;

import java.util.Scanner;

public class Level1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = input.nextInt();
        System.out.println("Enter number 2: ");
        int b = input.nextInt();
        System.out.println("Sum: ");
        System.out.println(a + b);

        input.close();
    }
}
