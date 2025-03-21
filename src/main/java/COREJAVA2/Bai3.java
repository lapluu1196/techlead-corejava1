package COREJAVA2;

import java.util.HashMap;
import java.util.Map;

public class Bai3 {
    //Bài tập 3: HashMap Hãy tạo một chương trình Java để thực hiện các thao tác cơ bản trên một HashMap. Hãy tạo một HashMap để lưu trữ cặp key-value với key là tên của một người và value là tuổi của người đó. Thực hiện các thao tác sau:
    //Thêm các cặp key-value vào HashMap.
    //Hiển thị danh sách tên của tất cả các người trong HashMap.
    //Tìm tuổi của một người dựa trên tên của họ.
    //Xóa một người cụ thể khỏi HashMap.
    //Kiểm tra xem một người có tồn tại trong HashMap hay không.

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Thêm các cặp key-value vào HashMap
        map.put("Quan", 25);
        map.put("Viet Anh", 30);
        map.put("Hung", 35);

        // Hiển thị danh sách tên của tất cả các người trong HashMap
        System.out.println("Danh sách tên của tất cả các người: " + map.keySet());

        // Tìm tuổi của một người dựa trên tên của họ
        System.out.println("Tuổi của Quan: " + map.get("Quan"));

        // Xóa một người khỏi HashMap
        map.remove("Viet Anh");

        // Kiểm tra xem một người có tồn tại trong HashMap hay không
        System.out.println("Có người tên Viet Anh hay không?: " + map.containsKey("Viet Anh"));
    }
}
