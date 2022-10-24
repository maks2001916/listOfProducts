import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Recipes
{
    private HashMap<Product, Integer> products;
    private int sumPrice;
    private int title;

    public void addProduct(Product product, int quantity) {
        Integer sQuantity = 0;
        if (quantity < 1) {
            quantity = 1;
        }
        sumPrice += product.getPrice() * quantity;
        if (products.get(product).equals(product.getName())) {
            throw new RuntimeException("продукт с таким названием уже есть");
        } else {
            sQuantity.valueOf(quantity);
            products.put(product, sQuantity);
        }
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public int getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return sumPrice == recipes.sumPrice && Objects.equals(products, recipes.products) && Objects.equals(title, recipes.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, sumPrice, title);
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "products=" + products +
                ", sumPrice=" + sumPrice +
                ", title='" + title + '\'' +
                '}';
    }
}
