package pr1;

public class FabricMethodImpl extends FabricMethod {

    @Override
    Product fabricMethod(String product) {
        Product readyProduct;

        switch (product) {
            case "car":
                readyProduct = new Car();
                ((Car) readyProduct).brand = "W";
                readyProduct.price = 3.59;
                break;
            case "cuddly":
                readyProduct = new Cuddly();
                ((Cuddly) readyProduct).softness = "max";
                readyProduct.price = 44.20;
                break;
            default:
                readyProduct = new Product() {
                };
                readyProduct.price = 0.1;
        }

        return readyProduct;
    }
}