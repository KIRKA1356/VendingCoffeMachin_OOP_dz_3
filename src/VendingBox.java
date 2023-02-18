import java.util.ArrayList;

public class VendingBox {
    private ArrayList<Product> products;

    public VendingBox() {
        this.products = new ArrayList<>();
    }
    public void showProductsInBox() {
        System.out.println("Вы можете купить:");
        for (Product product : products) {
            product.getProductInfo();
        }
        System.out.println("--------------------------------");
    }

    public void addProductToBox(Product product) {
        if (!products.contains(product))
            this.products.add(product);
    }
}
