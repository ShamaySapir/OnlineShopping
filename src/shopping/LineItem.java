package shopping;

public class LineItem {

    private int quantity;
    private int price;
    private Product product;
    private ShoppingCart shoppingCart;
    private Order order;

    public LineItem(int quantity, int price, Product product, ShoppingCart shoppingCart, Order order) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
        this.shoppingCart = shoppingCart;
        this.order = order;
    }
}
