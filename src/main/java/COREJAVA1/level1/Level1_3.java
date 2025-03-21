package COREJAVA1.level1;

import java.util.Scanner;

public class Level1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square of " + num + " is: " + num * num);

        sc.close();
    }
}
