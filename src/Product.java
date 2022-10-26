import java.util.*;

public class Product {
    private String name;  //имя
    private int price;  //цена
    private int quantity;  //количество

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String name, int price, int quantity) {

        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException("введённое значение уже занесено в список");
        }

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new RuntimeException("введённое значение уже занесено в список");
        }
        if (price > 0) {
            this.price = price;
        } else {
            throw new RuntimeException("введённое значение уже занесено в список");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
