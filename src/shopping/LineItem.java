package shopping;

public class LineItem {

    private int quantity;
    private int price;
    private Product product;
    private ShoppingCart shoppingCart;
    private Order order;
    private int object_id;

    public LineItem(int quantity, int object_id) {
        this.quantity = quantity;
        this.object_id = object_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrice(){
        if (this.product != null){
            price = product.getPrice() * this.quantity;
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public int getObject_id() {
        return object_id;
    }

    public void setObject_id(int object_id) {
        this.object_id = object_id;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", product=" + product +
                ", shoppingCart=" + shoppingCart +
                ", order=" + order +
                ", object_id=" + object_id +
                '}';
    }
}
