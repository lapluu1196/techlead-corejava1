package util;

import java.util.Scanner;

public class InputUtil {
    private static int inputNumberOfElement(Scanner sc) {
        int n = 0;
        while (true) {
            try {
                System.out.println("The numbers of the elements: ");
                n = Integer.parseInt(sc.nextLine());
                if (n > 1) break;
                else System.out.println("The number of elements must be at least 2.");
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return n;
    }

    public static int[] inputListOfNumber(Scanner sc) {
        int n = inputNumberOfElement(sc);

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.println("Enter number " + (i + 1) + ": ");
                    nums[i] = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }
            }
        }
        return nums;
    }

    public static String[] inputListOfString(Scanner sc) {
        int n = inputNumberOfElement(sc);

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        return strings;
    }

    public static int validateIntegerInput(Scanner sc) {
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n > 1) break;
                else System.out.println("The number of elements must be at least 2.");
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return n;
    }

    public static double validateDoubleInput(Scanner sc) {
        double n = 0;
        while (true) {
            try {
                n = Double.parseDouble(sc.nextLine());
                if (n > 0) break;
                else System.out.println("The number must be > 0.");
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return n;
    }
}
