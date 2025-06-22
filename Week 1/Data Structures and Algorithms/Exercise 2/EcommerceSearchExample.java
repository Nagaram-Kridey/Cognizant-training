import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearchExample {

    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        public String toString() {
            return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
        }
    }

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(5, "Laptop", "Electronics"),
            new Product(3, "Shirt", "Clothing"),
            new Product(9, "Book", "Books"),
            new Product(1, "Phone", "Electronics"),
            new Product(7, "Shoes", "Footwear")
        };

        System.out.println("Linear Search:");
        Product found1 = linearSearch(products, 9);
        System.out.println(found1 != null ? found1 : "Product not found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\nBinary Search:");
        Product found2 = binarySearch(products, 9);
        System.out.println(found2 != null ? found2 : "Product not found");
    }
}