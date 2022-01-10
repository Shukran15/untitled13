package com.company;

public class Product implements Comparable <Product> {
   private final String name;

    public Product(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }



    @Override
    public int compareTo(Product o) {
        return 0;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
