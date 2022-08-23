package bankUI;

import java.util.LinkedList;

// Product class
class Product {
    private final LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        // Adding parts
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("\nUser Interface completed as below :");
        for (String part : parts)
            System.out.println(part);
    }
}
