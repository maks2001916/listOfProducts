import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List list1 = new List();
        Product product1 = new Product("продукт 1", 1, 1);
        Product product2 = new Product("продукт 2", 2, 2);
        list1.setProduct(product1);
        list1.setProduct(product2);
        Recipes recipes1 = new Recipes();
        recipes1.addProduct(product1, "рецепт 1");

    }
}