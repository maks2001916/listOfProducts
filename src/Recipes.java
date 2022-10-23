import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Recipes
{
    private HashMap<Product, String> products;
    private int sumPrice;
    private int title;

    public void addProduct(Product product, int qualit) {
        if (qualit < 1) {
            qualit = 1;
        }
        sumPrice = (sumPrice + product.getPrice()) * qualit;
        if (products.get(product) == product.getName()) {
            this.products = products;
        } else {
            throw new RuntimeException("рецепт с таким названием уже есть");
        }
    }

    public HashMap<Product, String> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, String> products) {
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
