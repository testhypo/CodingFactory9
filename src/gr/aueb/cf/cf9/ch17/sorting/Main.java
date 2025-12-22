package gr.aueb.cf.cf9.ch17.sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(
                List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 4),
                new Product("Apples", 22.5, 120)
                )
        );

        products.sort(Comparator.naturalOrder()); // Ascending Order
        products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());  // Descending Order

        products.sort(Comparator.comparing(Product::getPrice));
//        products.sort((a, b) -> b.getQuantity() - a.getQuantity());       // Ascending Order

        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice, Comparator.reverseOrder())
                .thenComparing(Product::getDescription).reversed());
    }
}
