import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class List {
    private Product product;

    Set<Product> set = new HashSet<>();

    public void setProduct(Product product) {
        if (set.contains(product) == false) {
            set.add(product);
        } else {
            throw new RuntimeException("продукт уже содержится в корзине");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        return Objects.equals(product, list.product) && Objects.equals(set, list.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, set);
    }

    @Override
    public String toString() {
        return "List{" +
                "product=" + product +
                ", set=" + set +
                '}';
    }
}
