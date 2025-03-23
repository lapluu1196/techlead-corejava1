package COREJAVA2.bai8.service;

import COREJAVA2.bai8.entity.Product;
import util.InputUtil;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductService {
    public static String display(Product product) {
        return "Code: " + product.getCode() + ", name: " + product.getName() + ", price: " + product.getPrice() + ", quantity: " + product.getQuantity();
    }

    //Thêm sản phẩm mới vào danh sách.
    public static void addProduct(Scanner sc, Map<String, Product> productMap) {
        System.out.println("----- Add a product -----");
        System.out.print("Enter code of product: ");
        String code = sc.nextLine();
        System.out.print("Enter name of product: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = InputUtil.validateDoubleInput(sc);
        System.out.print("Enter quantity: ");
        int quantity = InputUtil.validatePositiveIntegerInput(sc);
        Product product = new Product(code, name, price, quantity);

        productMap.put(code, product);
    }

    //Hiển thị danh sách tất cả các sản phẩm.
    public static void displayProduct(Map<String, Product> productMap) {
        System.out.println("----- List of product -----");
        AtomicInteger stt = new AtomicInteger();
        productMap.forEach((k, v) -> System.out.println(stt.incrementAndGet() + ". " + k + ": " + display(v)));
    }

    //Tìm thông tin sản phẩm dựa trên mã sản phẩm.
    public static Product findByCode(Map<String, Product> productMap, String code) {
        return productMap.get(code);
    }

    //Xóa sản phẩm khỏi danh sách dựa trên mã sản phẩm.
    public static void deleteByCode(Map<String, Product> productMap, String code) {
        System.out.println("----- Delete a product -----");
        if (productMap.remove(code) != null) {
            System.out.println("The product has been removed!");
        } else {
            System.out.println("Product not found!");
        }
    }

    //Cập nhật thông tin sản phẩm.
    public static void updateByCode(Scanner sc, Map<String, Product> productMap, String code) {
        System.out.println("----- Update a product -----");
        Product existProduct = productMap.get(code);
        if (existProduct == null) {
            System.out.println("Product not found!");
        } else {
            System.out.print("Enter new name (leave blank if don't want change): ");
            String productName = sc.nextLine();
            if (!productName.isEmpty()) {
                existProduct.setName(productName);
            }

            System.out.print("Enter new price (leave blank if don't want change): ");
            String priceInput = sc.nextLine();
            if (!priceInput.isEmpty()) {
                double price = Double.parseDouble(priceInput);
                existProduct.setPrice(price);
            }

            System.out.print("Enter new quantity (leave blank if don't want change): ");
            String quantityInput = sc.nextLine();
            if (!quantityInput.isEmpty()) {
                int quantity = Integer.parseInt(quantityInput);
                existProduct.setQuantity(quantity);
            }

            System.out.println("The product has been updated!");
        }
    }
}
