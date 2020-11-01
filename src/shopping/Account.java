package shopping;

import java.util.Date;

public class Account {

    private String accountId;
    private String billingAddress;
    private boolean isClosed;
    private Date open;
    private Date closed;
    private int balance;
    //private ShoppingCart shoppingCart;
    //private ArrayList<Order> orders;
    //private ArrayList<Payment> payments;

    public Account(String accountId, String billingAddress) {
        this.accountId = accountId;
        this.billingAddress = billingAddress;
        this.isClosed = false;
        this.open = new Date();
        this.closed = null;
        this.balance = 0;
        //this.shoppingCart = new ShoppingCart(this.open);
        //this.orders = new ArrayList<>();
        //this.payments = new ArrayList<>();
    }

}
