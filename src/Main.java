import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws WrongProductException {
        HashMap<Product, String> list1 = new HashMap<>();
        Product product1 = new Product("продукт 1", 1, 1);
        Product product2 = new Product("продукт 2", 2, 2);
        list1.put(product1, "1");
        list1.put(product2, "2");
        Recipes recipes1 = new Recipes();
        recipes1.addProduct(product1, 1);

    }
}