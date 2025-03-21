package level5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Level5_8 {
    //Switch Order: Viết function để thay đổi thứ tự order của các object.
    //Ví dụ:
    //arr = [{id: 10, order: 0}, {id: 12, order: 1}, {id: 9, order: 2}, {id: 11, order: 3}]
    //switchOrder(9, 1)  // ( chuyển object có id bằng 9 lên vị trí order = 1, thay đổi lại giá trị của order )
    //👉 [{id: 10, order: 0}, {id: 9, order: 1}, {id: 12, order: 2}, {id: 11, order: 3}]
    public static List<Map<String, Object>> switchOrder(List<Map<String, Object>> arr, int id, int newOrder) {
        Map<String, Object> target = arr.stream()
                .filter(obj -> obj.get("id").equals(id))
                .findFirst()
                .orElse(null);

        if (target == null) {
            return arr;
        }

        arr.remove(target);

        arr.add(newOrder, target);

        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).put("order", i);
        }

        return arr;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> arr = new ArrayList<>(Arrays.asList(
                new HashMap<>(Map.of("id", 10, "order", 0)),
                new HashMap<>(Map.of("id", 12, "order", 1)),
                new HashMap<>(Map.of("id", 9, "order", 2)),
                new HashMap<>(Map.of("id", 11, "order", 3))
        ));

        System.out.println("Original: ");
        arr.forEach(System.out::println);

        List<Map<String, Object>> result = switchOrder(arr, 9, 1);

        System.out.println("Result: ");
        result.forEach(System.out::println);
    }
}
