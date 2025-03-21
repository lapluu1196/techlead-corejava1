package COREJAVA1.level5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level5_5 {
    public static void main(String[] args) {
        //Group by: Cho đầu vào là 1 collection ( array of object ), Viết một function để trả ra 1 OBJECT mới chứa
        //dữ liệu được group theo trường chỉ định.
        //Ví dụ :
        //const collect = [{a: 1, b: 2}, {a: 1, b: 3}, {a: 2, b: 2}];
        //groupBy(collect, ‘a');
        //👉 output {1: [{a: 1, b: 2}, {a: 1, b: 3}], 2: [{a: 2, b: 2}]}

        List<Map<String, Object>> collect = new ArrayList<>();

        collect.add(new HashMap<>(Map.of("a", 1, "b", 2)));
        collect.add(new HashMap<>(Map.of("a", 1, "b", 3)));
        collect.add(new HashMap<>(Map.of("a", 2, "b", 2)));
        System.out.println("Collect: " + collect);

        Map<Object, List<Map<String, Object>>> result = groupBy(collect, "b");

        System.out.println("Result: " + result);
    }

    public static Map<Object, List<Map<String, Object>>> groupBy(List<Map<String, Object>> collect, String key) {
        Map<Object, List<Map<String, Object>>> result = new HashMap<>();

        for (Map<String, Object> obj : collect) {
            Object value = obj.get(key);

            result.putIfAbsent(value, new ArrayList<>());

            result.get(value).add(obj);
        }

        return result;
    }
}
