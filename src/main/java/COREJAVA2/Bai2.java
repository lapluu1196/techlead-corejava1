package COREJAVA2;

import java.util.HashSet;
import java.util.Set;

public class Bai2 {
    //Bài tập 2: HashSet Hãy tạo một chương trình Java để thực hiện các thao tác cơ bản trên một HashSet. Hãy tạo một HashSet chứa tên của các quốc gia và thực hiện các thao tác sau:
    //Thêm các tên quốc gia vào HashSet.
    //Hiển thị danh sách các quốc gia đã thêm vào.
    //Kiểm tra xem một quốc gia có tồn tại trong HashSet hay không.
    //Xóa một quốc gia cụ thể khỏi HashSet.
    //Tính số lượng các quốc gia có trong HashSet.

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Thêm các quốc gia vào HashSet
        set.add("Việt Nam");
        set.add("Anh");
        set.add("Mỹ");
        set.add("Nga");
        set.add("Trung Quốc");
        set.add("Hàn Quốc");
        set.add("Úc");

        // Hình thị danh sách các quốc gia
        System.out.println("Danh sách các quốc gia: " + set);

        // Kiểm tra quốc gia có tồn tại trong HashSet hay không
        System.out.println("Có quốc gia Việt Nam hay không?: " + set.contains("Việt Nam"));

        // Xóa quốc gia
        set.remove("Úc");
        System.out.println("Danh sách các quốc gia: " + set);

        // Tính số lượng quốc gia
        System.out.println("Số lượng quốc gia: " + set.size());
    }
}
