package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Product> store = new HashMap<>();

        store.put("M56677889", new Product("Milk"));
        store.put("P94440339", new Product("Protein"));
        store.put("P34532257", new Product("Pasta"));
        store.put("W67744567", new Product("Water"));
        store.put("M25676890", new Product("Meat"));
        store.put("CH3457659", new Product("Chocolate"));

        printMap(store);

        store.remove("M20215890N6");

        Set<Map.Entry<String, Product>> entrySet = store.entrySet();
        List<Map.Entry<String, Product>> list = new ArrayList<>(entrySet);

        sortMapByValue(list);

        printSortedMap(list);
    }

    public static void printMap(Map<String, Product> store) {
        System.out.println("Текущий список товаров:");
        store.forEach((key, value) -> System.out.printf("Артикул: %s Товар: %s \n", key, value.getName()));
    }

    public static void sortMapByValue(List<Map.Entry<String, Product>> list) {
        list.sort(Comparator.comparing(o -> o.getValue().getName()));
    }

    public static void printSortedMap(List<Map.Entry<String, Product>> list) {
        System.out.println("\nОстаток товаров за прошедший месяц:");
        list.forEach(s-> System.out.println(" Товар: " + s.getValue().getName() + " -> "));
    }


}