package level5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Level5_4 {
    public static void main(String[] args) {
        //uniq ArrayObject: Giống Uniq nhưng mở rộng cho 1 collection
        // Ví dụ:
        //[{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }, { 'y': 2, 'x': 1 }]
        //👉 [{ ‘x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }]

        List<Map<String, Object>> arrayObject = new ArrayList<>();

        arrayObject.add(new HashMap<>(Map.of("x", 1, "y", 2)));
        arrayObject.add(new HashMap<>(Map.of("x", 2, "y", 1)));
        arrayObject.add(new HashMap<>(Map.of("y", 2, "x", 1)));

        System.out.println("ArrayObject: ");
        for (Map<String, Object> obj : arrayObject) {
            System.out.println(obj);
        }

        List<Map<String, Object>> result = uniqArrayObject(arrayObject);

        System.out.println("Result: ");
        for (Map<String, Object> obj : result) {
            System.out.println(obj);
        }
    }

    public static List<Map<String, Object>> uniqArrayObject(List<Map<String, Object>> arrayObject) {
        Set<String> seen = new HashSet<>();
        List<Map<String, Object>> result = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        for (Map<String, Object> obj : arrayObject) {
            try {
                String json = objectMapper.writeValueAsString(obj);

                if (!seen.contains(json)) {
                    seen.add(json);
                    result.add(obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
