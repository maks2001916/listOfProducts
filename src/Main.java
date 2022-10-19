import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        Product product1 = new Product("продукт 1", 1, 1);
        Product product2 = new Product("продукт 2", 2, 2);
        list.setProduct(product1);
        list.setProduct(product2);
    }
}