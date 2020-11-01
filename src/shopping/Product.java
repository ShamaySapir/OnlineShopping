package shopping;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String id;
    private String name;
    private Supplier supplier;
    private PremiumAccount seller;
    private List<LineItem> lineItems;

    public Product(String id, String name, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
        this.lineItems = new ArrayList<>();
    }

    public Product(String id, String name, Supplier supplier, PremiumAccount seller) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
        this.seller = seller;
        this.lineItems = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public PremiumAccount getSeller() {
        return seller;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void addLineItem(LineItem lineItem) {

        if(lineItem != null){
            this.lineItems.add(lineItem);
        }
    }

    public void setSeller(PremiumAccount seller) {
        this.seller = seller;
    }
}
