package COMPANY;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create three Product objects
        Product product1 = new Product("Product 1", 19.99);
        Product product2 = new Product("Product 2", 14.99);
        Product product3 = new Product("Product 3", 24.99);

        // Find the product with the lowest price
        Product lowestPriceProduct = findLowestPriceProduct(product1, product2, product3);

        // Display the result
        if (lowestPriceProduct != null) {
            System.out.println("The product with the lowest price is: " + lowestPriceProduct.getName());
            System.out.println("Price: $" + lowestPriceProduct.getPrice());
        } else {
            System.out.println("No products found.");
        }
    }

    public static Product findLowestPriceProduct(Product... products) {
        if (products.length == 0) {
            return null;
        }

        Product lowestPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() < lowestPriceProduct.getPrice()) {
                lowestPriceProduct = products[i];
            }
        }
        return lowestPriceProduct;
    }
}
