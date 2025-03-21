package COREJAVA2.bai8;

import COREJAVA2.bai8.entity.Product;
import COREJAVA2.bai8.service.ProductService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai8 {
    //Bài tập 8: Quản lý danh sách sản phẩm Hãy tạo một ứng dụng quản lý danh sách sản phẩm sử dụng HashMap.
    // Mỗi sản phẩm có một mã sản phẩm làm key và thông tin sản phẩm làm value (ví dụ: tên sản phẩm, giá, số lượng).
    // Hãy cung cấp các chức năng sau:
    //Thêm sản phẩm mới vào danh sách.
    //Hiển thị danh sách tất cả các sản phẩm.
    //Tìm thông tin sản phẩm dựa trên mã sản phẩm.
    //Xóa sản phẩm khỏi danh sách dựa trên mã sản phẩm.
    //Cập nhật thông tin sản phẩm.

    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("-------------------------------------");
            System.out.println("===== PRODUCT MANAGER =====");
            System.out.println("1. Add a product");
            System.out.println("2. Display all products");
            System.out.println("3. Find by product code");
            System.out.println("4. Remove a product");
            System.out.println("5. Update a product");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Please choose function you'd like to do: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ignored) {}

            switch (choice) {
                case 1:
                    ProductService.addProduct(sc, productMap);
                    break;
                case 2:
                    ProductService.displayProduct(productMap);
                    break;
                case 3:
                    System.out.print("Enter code: ");
                    String codeFind = sc.nextLine();
                    Product product = ProductService.findByCode(productMap, codeFind);
                    if (product != null) {
                        ProductService.display(product);
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter code: ");
                    String codeDelete = sc.nextLine();
                    ProductService.deleteByCode(productMap, codeDelete);
                    break;
                case 5:
                    System.out.print("Enter code: ");
                    String codeUpdate = sc.nextLine();
                    ProductService.updateByCode(sc, productMap, codeUpdate);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (true);
    }
}
