package level1;

import java.util.Scanner;

public class Level1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of string: " + str.length());

        sc.close();
    }
}
