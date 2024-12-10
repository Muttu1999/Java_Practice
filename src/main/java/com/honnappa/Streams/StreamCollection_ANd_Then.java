package com.honnappa.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollection_ANd_Then {
    public static void main(String[] args) {


        List<Product> productList = Arrays.asList(new Product("Apple", 1200),
                new Product("Samsung", 1300),
                new Product("Nokia", 1200),
                new Product("Iphone", 1000),
                new Product("Apple", 1200),
                new Product("Apple", 1200));

        String MaxPriceProduct = productList.stream().collect(Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                (productOptional -> productOptional.isPresent() ? productOptional.get().getName() : "None")

        ));
        System.out.println(MaxPriceProduct);
    }


}


