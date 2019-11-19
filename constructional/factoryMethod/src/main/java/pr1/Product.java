package pr1;

public abstract class Product {
    Double price;

    @Override
    public String toString() {
        return "Product " + price;
    }
}
