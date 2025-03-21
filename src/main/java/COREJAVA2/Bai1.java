package COREJAVA2;

import java.util.ArrayList;

public class Bai1 {
    //Bài tập 1: ArrayList Hãy tạo một chương trình Java để thực hiện các thao tác cơ bản trên một ArrayList. Hãy bắt đầu với một ArrayList chứa các số nguyên và thực hiện các thao tác sau:
    //Thêm các phần tử vào ArrayList.
    //Hiển thị các phần tử trong ArrayList.
    //Tính tổng của tất cả các phần tử trong ArrayList.
    //Tìm giá trị lớn nhất và nhỏ nhất trong ArrayList.
    //Xóa một phần tử cụ thể khỏi ArrayList.
    //Kiểm tra một phần tử có tồn tại trong ArrayList hay không.

    public static void main(String[] args) {
        //Them cac phan tu vao mang
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        //Hien thi cac phan tu trong mang
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //Tinh tong cac phan tu trong mang
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);

        int max = arr.get(0);
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max);
        System.out.println("Phan tu nho nhat trong mang la: " + min);

        //Xoa cac phan tu trong mang
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 5) {
                arr.remove(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }


        //Kiem tra cac phan tu trong mang
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 5) {
                System.out.println("Phan tu 5 co ton tai trong mang");
            } else {
                System.out.println("Phan tu 5 khong ton tai trong mang");
            }
        }
    }
}
