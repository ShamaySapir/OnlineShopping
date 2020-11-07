package shopping;

import java.util.ArrayList;
import java.util.List;

public class PremiumAccount extends Account {
    private ArrayList<Product> products;

    public PremiumAccount(String accountId, String billingAddress, int balance, int object_id) {
        super(accountId, billingAddress,balance,object_id);
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product, int quantity, int price){
        product.setPrice(price);
        product.setInStock(quantity);
        products.add(product);

    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "PremiumAccount{" +
                "products=" + products +
                ", accountId='" + accountId + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", isClosed=" + isClosed +
                ", open=" + open +
                ", closed=" + closed +
                ", balance=" + balance +
                ", shoppingCart=" + shoppingCart +
                ", orders=" + orders +
                ", payments=" + payments +
                ", customer=" + customer +
                ", object_id=" + object_id +
                '}';
    }
}
