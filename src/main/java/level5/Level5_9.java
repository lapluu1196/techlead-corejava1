package level5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Level5_9 {
    //SumAll: Viết function để tính tổng giá trị của các key của các phần tử con trong mảng bất kỳ:
    //Ví dụ:
    //Arr = [{a: 2, b: 10}, {a: 12, c: 11}, {a: 8, b: 14, d: 20}, {a: ‘8’}]
    //👉 {a: 30, b: 24, c: 11, d: 20}
    //Đầu vào là một mảng các object và các phần tử trong object không cố định.
    //Gợi ý js: reducer(), Object.keys()
    public static Map<String, Integer> sumAll(List<Map<String, Integer>> arr) {
        Map<String, Integer> sumMap = new HashMap<>();

        for (Map<String, Integer> obj : arr) {
            for (String key : obj.keySet()) {
                sumMap.put(key, sumMap.getOrDefault(key, 0) + obj.get(key));
            }
        }

        return sumMap;
    }

    public static void main(String[] args) {
        List<Map<String, Integer>> arr = List.of(
                Map.of("a", 2, "b", 10),
                Map.of("a", 12, "c", 11),
                Map.of("a", 8, "b", 14, "d", 20),
                Map.of("a", 8)
        );

        System.out.println("Original: " + arr);

        Map<String, Integer> result = sumAll(arr);

        System.out.println("Result: " + result);
    }
}
