package COREJAVA1.level5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Level5_7 {
    //MapKey: Cho 1 mảng các key, vào 1 mảng các object , Viết một function để trả ra một mảng các object theo thứ tự mảng các key. ( Yêu cầu dùng hàm map )
    //Ví dụ
    //keys = [‘b', ‘a', ‘c']
    //collections = [{a: 1, b: 1, c: 2, d: 4, e: 5}, {a: 2, b:1, c: 5, d: 4, e: 5}, {d: 4, e: 5, a: 22, b:11, c: 51, }]
    //👉 [{b: 1, a: 1, c: 2}, {b: 1, a: 2, c: 5}, {b: 11, a: 22, c: 51}]
    public static List<Map<String, Object>> mapKey(List<String> keys, List<Map<String, Object>> collections) {
        return collections.stream()
                .map(obj -> keys.stream()
                .filter(obj::containsKey)
                .collect(Collectors.toMap(
                        key -> key,
                        obj::get,
                        (oldValue, newValue) -> oldValue, HashMap::new)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> keys = Arrays.asList("b", "a", "c");

        List<Map<String, Object>> collections = new ArrayList<>();
        collections.add(new HashMap<>(Map.of("a", 1, "b", 1, "c", 2, "d", 4, "e", 5)));
        collections.add(new HashMap<>(Map.of("a", 2, "b", 1, "c", 5, "d", 4, "e", 5)));
        collections.add(new HashMap<>(Map.of("d", 4, "e", 5, "a", 22, "b", 11, "c", 51)));

        List<Map<String, Object>> result = mapKey(keys, collections);

        System.out.println("Kết quả: ");
        result.forEach(System.out::println);
    }
}
