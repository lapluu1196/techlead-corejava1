package COREJAVA2;

import java.util.ArrayList;
import java.util.List;

public class Bai4 {
    //Bài tập 4: Sắp xếp ArrayList Hãy tạo một chương trình Java để sắp xếp một ArrayList chứa các số nguyên theo
    //thứ tự tăng dần và giảm dần. Sử dụng các phương thức sắp xếp có sẵn trong Collection Framework để làm điều này.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(8);
        list.add(7);

        list.sort(Integer::compare);

        System.out.println("Thu tu tang dan " + list.toString());
        System.out.println("Thu tu giam dan " + list.reversed().toString());
    }
}
