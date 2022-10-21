import java.util.Objects;
import java.util.Set;

public class Recipes
{
    private Set<Product> products;
    private int sumPrice;
    private String title;

    public void addProduct(Product product, String title) {
        sumPrice = sumPrice + product.getPrice();
        products.add(product);
        if (products.contains(title) == false) {
            this.title = title;
        } else {
            throw new RuntimeException("рецепт с таким названием уже есть");
        }
    }





    public Set<Product> getProducts() {
        return products;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public String getTitle() {
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
