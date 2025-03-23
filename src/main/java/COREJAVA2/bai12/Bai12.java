package COREJAVA2.bai12;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bai12 {
    //Chúng ta có 1 list/set các các sản phẩm bao gồm các thông tin tên, mã, giá bán, ngày sản xuất.
    // Hãy viết 1 đoạn chương trình để sắp xếp các sản phẩm theo các tiêu chí sau:
    //Theo tên
    //Theo giá bán
    //Theo ngày sản xuất
    //Theo giá bán và ngày sản xuất

    public static void main(String[] args) {
        Set<Product12> productList = new HashSet<>();

        productList.add(new Product12("Laptop", "L01", 5000000, LocalDate.of(2022, 1, 1)));
        productList.add(new Product12("Laptop", "L02", 6000000, LocalDate.of(2022, 1, 2)));
        productList.add(new Product12("Laptop", "L03", 7000000, LocalDate.of(2022, 1, 3)));
        productList.add(new Product12("Laptop", "L04", 8000000, LocalDate.of(2022, 1, 4)));
        productList.add(new Product12("Laptop", "L05", 9000000, LocalDate.of(2022, 1, 5)));
        productList.add(new Product12("Laptop", "L06", 10000000, LocalDate.of(2022, 1, 6)));
        productList.add(new Product12("Macbook", "L07", 11500000, LocalDate.of(2022, 1, 7)));
        productList.add(new Product12("Macbook", "L08", 7500000, LocalDate.of(2022, 1, 8)));
        productList.add(new Product12("PC", "L09", 13500000, LocalDate.of(2022, 1, 9)));
        productList.add(new Product12("PC", "L10", 9500000, LocalDate.of(2022, 1, 10)));
        productList.add(new Product12("PC", "L11", 10500000, LocalDate.of(2022, 1, 9)));

        productList.forEach(System.out::println);

        System.out.println("Sorted by name: ");
        productList.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);

        System.out.println("Sorted by price: ");
        productList.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .forEach(System.out::println);

        System.out.println("Sorted by date of manufacture: ");
        productList.stream()
                .sorted((p1, p2) -> p1.getDateOfManufacture().compareTo(p2.getDateOfManufacture()))
                .forEach(System.out::println);

        System.out.println("Sorted by price and date of manufacture: ");
        productList.stream().sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .sorted((p1, p2) -> p1.getDateOfManufacture().compareTo(p2.getDateOfManufacture()))
                .forEach(System.out::println);
    }
}
