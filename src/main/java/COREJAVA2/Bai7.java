package COREJAVA2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai7 {
    //Bài tập 7: Tính toán điểm trung bình của sinh viên Hãy viết một chương trình Java để tính điểm trung bình
    // của các sinh viên trong lớp học. Sử dụng HashMap để lưu trữ tên của sinh viên làm key và danh sách điểm số
    // làm value. Sau đó, tính điểm trung bình cho mỗi sinh viên và hiển thị kết quả.
    public static Map<String, Integer> averageScore(Map<String, List<Integer>> scores) {
        Map<String, Integer> result = new HashMap<>();

        scores.forEach((key, value) -> {
            int sum = 0;
            for (int i = 0; i < value.size(); i++) {
                sum += value.get(i);
            }
            result.put(key, sum / value.size());
        });

        return result;
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> scores = new HashMap<>();
        scores.put("Nguyen Van A", List.of(5, 6, 7, 8, 9));
        scores.put("Nguyen Van B", List.of(6, 7, 8, 9, 10));
        scores.put("Nguyen Van C", List.of(7, 8, 9, 10, 11));
        scores.put("Nguyen Van D", List.of(8, 9, 10, 11, 12));

        Map<String, Integer> averageScores = averageScore(scores);

        averageScores.forEach((key, value) -> {
            System.out.println("Diem trung binh cua " + key + " la: " + value);
        });
    }
}
