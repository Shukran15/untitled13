package com.company;

public class Product {
   private final String name;

    public Product(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }




    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
