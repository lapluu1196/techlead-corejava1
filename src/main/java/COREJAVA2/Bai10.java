package COREJAVA2;

import util.InputUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bai10 {
    //Kiểm tra phân phối điểm số Hãy viết một chương trình Java để kiểm tra phân phối điểm số của một lớp học.
    // Người dùng sẽ nhập danh sách điểm số của sinh viên và chương trình sẽ tính số lượng sinh viên đạt điểm cao (>= 8.0),
    // số lượng sinh viên đạt điểm trung bình (>= 5.0 và < 8.0) và số lượng sinh viên trượt (dưới 5.0).
    // Sử dụng HashMap để lưu trữ điểm số làm key và số lượng sinh viên đạt điểm tương ứng làm value.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int highScore = 0, averageScore = 0, lowScore = 0;

            System.out.println("Enter number of student: ");
            int n = InputUtil.validatePositiveIntegerInput(sc);

            Map<Double, Integer> scores = new HashMap<>();
            System.out.println("Enter scores of student: ");
            for (int i = 0; i < n; i++) {
                while (true) {
                    try {
                        System.out.println("Enter score of student " + (i + 1) + ": ");
                        double score = Double.parseDouble(sc.nextLine());
                        if (score < 0 || score > 10) {
                            throw new Exception("Score must be between 0 and 10.");
                        }
                        scores.put(score, scores.getOrDefault(score, 0) + 1);
                        if (score >= 8.0) highScore += 1;
                        else if (score >= 5.0) averageScore += 1;
                        else lowScore += 1;
                        break;
                    } catch (Exception e) {
                        System.out.println("Please enter a valid score.");
                    }
                }
            }

            System.out.println("Scores: ");
            for (Map.Entry<Double, Integer> entry : scores.entrySet()) {
                System.out.println("Score: " + entry.getKey() + " - Number of student: " + entry.getValue());
            }
            System.out.println("Number of student with high score: " + highScore);
            System.out.println("Number of student with average score: " + averageScore);
            System.out.println("Number of student with low score: " + lowScore);
        }
    }
}
